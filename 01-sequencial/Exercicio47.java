package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo de quatro digitos(de 1000 a 9999): ");
        int numero = sc.nextInt();

        int milhar  = numero / 1000;
        int centena = (numero / 100) % 10;
        int dezena  = (numero / 10) % 10;
        int unidade = numero % 10;

        System.out.println(milhar);
        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);


        sc.close();
    }
}
