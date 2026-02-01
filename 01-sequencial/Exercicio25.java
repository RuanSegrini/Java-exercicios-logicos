package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de comprimento em acres para converter em metros quadrados:  ");
        double acres = sc.nextDouble();

        double metros = acres * 4048.58;

        System.out.printf("Valor em metros quadrados: %.2f", metros);

        sc.close();
    }
}
