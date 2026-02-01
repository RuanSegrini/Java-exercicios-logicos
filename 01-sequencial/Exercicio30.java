package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em real: R$");
        double real = sc.nextDouble();
        System.out.print("Digite a cotaçao do dolar: $");
        double cotacaoDolar = sc.nextDouble();

        double dolar = real / cotacaoDolar;

        System.out.printf("Valor em dolares: $%.2f", dolar);

        sc.close();
    }
}
