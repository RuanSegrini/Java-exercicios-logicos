package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo de tres digitos(de 100 a 999): ");
        int N = sc.nextInt();

        String invertidoStr = new StringBuilder(String.valueOf(N))
                .reverse()
                .toString();

        int invertido = Integer.parseInt(invertidoStr);

        System.out.println(invertido);

        sc.close();
    }
}
