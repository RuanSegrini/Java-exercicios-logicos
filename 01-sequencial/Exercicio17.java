package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em centimetros para converter em polegadas: ");
        double centimetros = sc.nextDouble();

        double polegadas = centimetros / 2.54;

        System.out.printf("Valor em polegadas: %.2f", polegadas);

        sc.close();
    }
}
