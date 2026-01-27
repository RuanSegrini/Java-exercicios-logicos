package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero ineiro impar: ");
        int N = sc.nextInt();

        System.out.printf("NUMERO DIGITADO: %d", N);
        
        sc.close();
    }
}
