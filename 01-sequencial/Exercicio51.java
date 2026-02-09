package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio51 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        double distancia = Math.sqrt(x * x + y * y);

        System.out.printf("Distancia da origem: %.2f%n", distancia);

        sc.close();
    }
}
