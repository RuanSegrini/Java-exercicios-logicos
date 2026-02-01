package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de comprimento em metros para converter em jardas: ");
        double metros = sc.nextDouble();

        double jardas = metros / 0.91;

        System.out.printf("Valor em jardas: %.2f", jardas);

        sc.close();
    }
}
