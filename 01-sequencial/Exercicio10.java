package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma velocidade em km/h(quilometro por hora) para converter em m/s(metro por segundo): ");
        double quilometro = sc.nextDouble();

        double metroPorSegundo = quilometro / 3.6;

        System.out.printf("Velocidade em m/s(metro por segundo): %.2f", metroPorSegundo);

        sc.close();
    }
}
