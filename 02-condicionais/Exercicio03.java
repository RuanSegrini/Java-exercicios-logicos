package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

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
            double numeroAoQuadrado = Math.pow(N, 2);
            System.out.printf("Numero ao quadrado: %.2f", numeroAoQuadrado);
        }

        sc.close();
    }
}
