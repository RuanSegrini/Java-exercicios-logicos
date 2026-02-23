package condicional;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que zero: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido");
        } else {

            int soma = 0;

            while (numero > 0) {
                soma += numero % 10;
                numero /= 10;
            }

            System.out.println("Soma dos algarismos: " + soma);
        }

        sc.close();
    }
}
