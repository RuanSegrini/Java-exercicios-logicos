package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius para converter em Fahrenheit: ");
        Double C = sc.nextDouble();

        double fahrenheit = C * (9.0 /5.0) + 32.0;

        System.out.printf("Temperatura em Fahrenheit: %.2f", fahrenheit);

        sc.close();
    }
