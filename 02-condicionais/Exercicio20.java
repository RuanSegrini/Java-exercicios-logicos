package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres valores: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {

            if (A == B && A == C) {
                System.out.println("Triangulo equilatero");
            }
            else if (A == B || A == C || B == C) {
                System.out.println("Triangulo isosceles");
            }
            else {
                System.out.println("Triangulo escaleno");
            }

        } else {
            System.out.println("Nao forma triangulo");
        }

        sc.close();
    }
}
