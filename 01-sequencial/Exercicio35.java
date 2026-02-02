package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do cateto A de um triangulo: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor do cateto B de um triangulo: ");
        double B = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        
        System.out.printf("Hipotenusa: %.2f", hipotenusa);

        sc.close();
    }
}
