package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quatro notas para informar a media: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double w = sc.nextDouble();

        double media = x + y + z + w / 4;

        System.out.printf("Media = %.2f", media);

        sc.close();
    }
}
