package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {


    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distancia em milhas para converter em quilometros: ");
        double milhas = sc.nextDouble();

        double quilometros = 1.61 * milhas;

        System.out.printf("Distancia em quilometros: %.2f", quilometros);

        sc.close();
    }
}
