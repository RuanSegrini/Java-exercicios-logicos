package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero real: ");
        double N = sc.nextDouble();

        double quintaParte = N / 5;

        System.out.printf("Quinta parte do numero: %.2f", quintaParte);



        sc.close();
    }
}
