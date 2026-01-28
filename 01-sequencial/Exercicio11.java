package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma velocidade em m/s(metros por segundo) para converter em km/h(quilometro por hora): ");
        double metroPorSegundo = sc.nextDouble();

        double quilometroHora = metroPorSegundo * 3.6;

        System.out.printf("Velocidade em km/h(quilometro por hora): %.2f km/h", quilometroHora);

        sc.close();
    }
}
