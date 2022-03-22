import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    O número primo 41, pode ser escrito como a soma de 6 números primos consecutivos:
        41 = 2 + 3 + 5 + 7 + 11 + 13
    Essa é a maior soma de números primos consecutivos que gera um número primo abaixo de 100.
    
    A maior soma de números primos consecutivos abaixo de 500 que gera um número primo contém 14 termos e é igual à 281:
        281 = 2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 + 29 + 31 + 37 + 41 + 43
    Faça um algoritmo que receba um número n e mostre qual é o maior número primo abaixo de n que é obtido através da soma consecutiva de números primos.
*/

public class Desafio3 {
    static boolean prime_check(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){ //se divisivel por um número que não seja ele mesmo é primo
                return false;
            }
        }
        return true;
    }
    static int list_sum(List<Integer> list, int slice_lenght){//soma dos n (slice_lenght) elementos de uma lista
        int sum = 0;
        for(int i=0; i<slice_lenght; i++){
            sum += list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> prime_list = new ArrayList<>();

        System.out.print("Insira um número: ");
        int num = input.nextInt();
        input.close();

        for(int i = 2; i <= num; i++){
            if(prime_check(i)){
                prime_list.add(i);
            }
        }

        for(int i = prime_list.size(); i > 0; i--){// começa do maior (final da lista) indo até o menor (inicio da lista)
            int aux = list_sum(prime_list, i);
            if(aux <= num && prime_check(aux)){// se menor que num e for primo imprimir e sair da iteração
                System.out.println("Maior num <= " + num + " obtido através da soma consecutiva de num primos é: " + aux);
                break;
            }
        } 
    }
}
