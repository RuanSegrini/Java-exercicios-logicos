package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em m³(metros cubicos) para converter em L(litros): ");
        Double metrosCubicos = sc.nextDouble();

        double litros = 1000 * metrosCubicos;

        System.out.printf("Valor em litros: %.2f", litros);

        sc.close();
    }
}
