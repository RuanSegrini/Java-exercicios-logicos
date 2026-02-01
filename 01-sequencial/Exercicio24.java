package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de comprimento em metros quadrados para converter em acres:  ");
        double metros = sc.nextDouble();

        double acres = metros / 0.000247;

        System.out.printf("Valor em jardas: %.2f", acres);

        sc.close();
    }
}
