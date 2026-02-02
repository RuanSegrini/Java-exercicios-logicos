package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("VALOR QUE CADA GANHADOR IRA RECEBER: ");

        double total = 780000;

        double primeiro = total * 0.46;
        double segundo = total * 0.32;
        double terceiro = total * 0.22;

        System.out.printf("Primeiro ganhador recebera: R$%.2f\n", primeiro);
        System.out.printf("Segundo ganhador recebera: R$%.2f\n", segundo);
        System.out.printf("Terceiro ganhador recebera: R$%.2f", terceiro);
        
        sc.close();
    }
}
