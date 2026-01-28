package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Kelvin para converter em graus Celsius: ");
        double K = sc.nextDouble();

        double celsius = K - 273.15;

        System.out.printf("Temperatura em Celsius: %.2f", celsius);

        sc.close();
    }
}
