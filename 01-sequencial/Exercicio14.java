package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um angulo em graus para converter em radianos: ");
        double graus = sc.nextDouble();

        double radianos = graus * 3.14 / 180;

        System.out.printf("Angulo em graus: %.2f", radianos);

        sc.close();
    }
}
