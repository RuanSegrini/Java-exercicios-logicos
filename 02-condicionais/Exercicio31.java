package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura:  ");
        double altura = sc.nextDouble();
        System.out.print("Informe o peso: ");
        double peso = sc.nextDouble();

        if (altura < 1.20) {
            if (peso <= 60) {
                System.out.print("Classificação: A");
            } else if (peso <= 90) {
                System.out.print("Classificação: D");
            } else {
                System.out.print("Classificação: G");
            }
        }
        else if (altura <= 1.70) {
                if (peso <= 60) {
                    System.out.print("Classificação: B");
                } else if (peso <= 90) {
                    System.out.print("Classificação: E");
                } else {
                    System.out.print("Classificação: H");
                }
            }
        else {
            if (peso <= 60) {
                System.out.print("Classificação: C");
            } else if (peso <= 90) {
                System.out.print("Classificação: F");
            } else {
                System.out.print("Classificação: I");
            }
        }

        sc.close();
    }
}
