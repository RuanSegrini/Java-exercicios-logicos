package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double N = sc.nextDouble();

        if(N > 0){
            double raizQuadrada = Math.sqrt(N);
            System.out.printf("Raiz quadrada: %.2f", raizQuadrada);
        }
        else{
            System.out.print("Número invalido");
        }

        sc.close();
    }
}
