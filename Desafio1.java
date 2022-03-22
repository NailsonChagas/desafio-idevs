import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Dado uma palavra qualquer p, construa um algoritmo que calcule a pontuação da palavra de acordo com a pontuação informada na tabela abaixo:

    LETRA                               VALOR
    A, E, I, O, U, L, N, R, S, T          1
    D, G                                  2
    B, C, M, P                            3
    F, H, V, W, Y                         4
    K                                     5
    J, X                                  8
    Q, Z                                 10

    Por exemplo, se a palavra “desafio” for digitada, a pontuação esperada será 11
*/

public class Desafio1 {
    public static void main(String[] args){
        Map<String, Integer> dictionary = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String word;
        int score = 0;

        dictionary.put("AEIOULNRST", 1);
        dictionary.put("DG", 2);
        dictionary.put("BCMP", 3);
        dictionary.put("FHVWY", 4);
        dictionary.put("K", 5);
        dictionary.put("JX", 8);
        dictionary.put("QZ", 10);

        System.out.print("Insira uma palavra: ");
        word = input.next().toUpperCase();
        input.close();

        for(int i = 0; i < word.length(); i++){
            char character = word.charAt(i);

            for(Map.Entry<String, Integer> set : dictionary.entrySet()){// itera o hashmap e verifica se o character pertence ao set 
                if(set.getKey().contains(Character.toString(character))){
                    score += set.getValue();
                    break;// se achado a pontuação do character sair desse loop e ir para proximo character
                }
            }

        }

        System.out.println("Pontuação: " + score);
    }
}
