package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido");
        } else {
            double log = Math.log(numero);
            System.out.printf("Logaritmo: %.4f%n", log);
        }

        sc.close();
    }
}
