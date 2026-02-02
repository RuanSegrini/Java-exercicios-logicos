package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int N = sc.nextInt();

        int sucessor = N + 1;
        int antecessor = N - 1;

        System.out.printf("Antecessor: %d\n", antecessor);
        System.out.printf("Sucessor: %d", sucessor);

        sc.close();
    }
}
