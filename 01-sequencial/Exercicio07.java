package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor em Fahrenheit pra converter em Celsius: ");
        Double F = sc.nextDouble();

        double celsius = 5.0 * (F - 32.0) / 9.0;

        System.out.printf("Temperatura em Celsius: %.2f", celsius);

        sc.close();
    }
}
