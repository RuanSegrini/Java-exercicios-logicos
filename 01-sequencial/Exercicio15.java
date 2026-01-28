package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um angulo em radianos para converter em graus: ");
        double radianos = sc.nextDouble();

        double graus = radianos * 180 / 3.14;

        System.out.printf("Angulo em graus: %.2f", graus);

        sc.close();
    }
}
