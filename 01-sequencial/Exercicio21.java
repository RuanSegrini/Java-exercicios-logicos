package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor de massa em libras para converter em quilogramas: ");
        double libras = sc.nextDouble();

        double quilogramas = libras * 0.45;

        System.out.printf("Valor em quilogramas: %.2f", quilogramas);

        sc.close();
    }
}
