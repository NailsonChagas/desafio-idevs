import java.util.ArrayList;
import java.util.List;

/*
    Escreva um algoritmo que mostre todos os números n menores que 10.000, onde n e n + 1 possuem o mesmo número de divisores. 
*/

public class Desafio2 {
    static int divisores(int num){
        int cont = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10000; i++){
            if((i + 1) <= 10000 ){
                if(divisores(i) == divisores(i+1)){
                    if(!list.contains(i)){ //impedindo repetições em casos como [230, 231, 232] e [445, 446, 447]
                        list.add(i);
                    }
                    list.add(i+1);
                }
            }
        }

        System.out.println(list.toString()); //imprimindo a lista com todos os números n em que n e n + 1 possuem o mesmo número de divisores
    }
}
