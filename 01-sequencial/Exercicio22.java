package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de comprimento em jardas para converter em metros: ");
        double jardas = sc.nextDouble();

        double metros = jardas * 0.91;

        System.out.printf("Valor em metros: %.2f", metros);

        sc.close();
    }
}
