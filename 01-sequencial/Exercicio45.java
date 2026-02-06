package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma letra maiuscula para converter em minuscula: ");
        char letraMaiuscula = sc.next().charAt(0);

        char letraMinuscula = Character.toLowerCase(letraMaiuscula);
        
        System.out.println(letraMinuscula);

        sc.close();
    }
}
