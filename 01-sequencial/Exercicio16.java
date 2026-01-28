package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um comprimento em polegadas para converter em centimetros: ");
        double polegadas = sc.nextDouble();

        double centimetros = polegadas * 2.54;

        System.out.printf("Comprimento em centimetros: %.2f", centimetros);

        sc.close();
    }
}
