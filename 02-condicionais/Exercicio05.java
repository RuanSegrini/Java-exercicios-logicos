package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double N = sc.nextDouble();

        if(N % 2 == 0){
            System.out.print("Numero par!");
        }
        else{
            System.out.print("Numero impar!");
        }

        sc.close();
    }
}
