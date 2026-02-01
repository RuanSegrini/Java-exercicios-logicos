package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int soma =(int) Math.pow(x, 2) + (int) Math.pow(y, 2) + (int) Math.pow(z, 2);

        System.out.printf("Soma dos quadrados dos tres valores digitados: %d", soma);

        sc.close();
    }
}
