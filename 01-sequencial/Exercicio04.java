package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero real: ");
        Double N = sc.nextDouble();

        double quadradoNumero = Math.pow(N, 2);

        System.out.printf("Quadrado do numero: %.2f", quadradoNumero);

        sc.close();
    }
}
