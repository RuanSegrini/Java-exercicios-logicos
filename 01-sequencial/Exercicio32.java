package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int N = sc.nextInt();

        int resultado = ((N * 3) + 1) + ((N * 2) - 1);

        System.out.printf("Resultado da soma do sucessor de seu triplo com o antecessor de seu dobro: %d", resultado);
        
        sc.close();
    }
}
