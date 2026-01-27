package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        Double N = sc.nextDouble();

        System.out.printf("Numero digitado: %.1f", N);

        sc.close();
    }
}
