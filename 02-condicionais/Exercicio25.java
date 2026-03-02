package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe as variaveis a, b e c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é equação de segundo grau!");
        }
        else {

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não existe raiz real!");
            }
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Raiz única!");
                System.out.println("Raiz = " + x);
            }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Duas raízes reais!");
                System.out.println("Raiz 1 = " + x1);
                System.out.println("Raiz 2 = " + x2);
            }
        }

        sc.close();
    }
}
