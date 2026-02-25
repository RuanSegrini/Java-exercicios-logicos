package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Escolha a opção ==== ");
        System.out.println("1 - Soma entre 2 números. ");
        System.out.println("2 - Diferença entre 2 números (maior pelo menor). ");
        System.out.println("3 - Produto entre 2 números. ");
        System.out.print("4 - Divisão entre 2 números (o denominador nao pode ser zero). ");

        System.out.print("Opção: ");
        int N = sc.nextInt();

        if (N >= 1 && N <= 4) {

            System.out.println("Digite dois numeros: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (N == 1) {
                System.out.println("SOMA = " + (x + y));
            }
            else if (N == 2) {
                System.out.println("RESULTADO DA DIFERENÇA = " + Math.abs(x - y));
            }
            else if (N == 3) {
                System.out.println("RESULTADO DO PRODUTO = " + (x * y));
            }
            else {
                if (y == 0) {
                    System.out.println("Denominador inválido!");
                } else {
                    System.out.println("RESULTADO DA DIVISÃO = " + (x / y));
                }
            }

        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
