package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em hectares para converter em metros quadrados: ");
        double hectares = sc.nextDouble();

        double metrosQuadrados = hectares * 10000;

        System.out.printf("Valor em metros quadrados: %.2f", metrosQuadrados);

        sc.close();
    }
}
