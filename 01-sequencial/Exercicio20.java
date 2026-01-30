package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de massa em quilogramas para converter em libras: ");
        double quilogramas = sc.nextDouble();

        double libras = quilogramas * 2.205;

        System.out.printf("Valor em libras: %.2f", libras);

        sc.close();
    }
}
