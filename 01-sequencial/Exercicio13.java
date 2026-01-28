package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distancia em quilometros para converter em milhas: ");
        double quilometros = sc.nextDouble();

        double milhas = quilometros / 1.61;

        System.out.printf("Distancia em milhas: %.2f", milhas);
        
        sc.close();
    }
}
