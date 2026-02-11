package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois numeros: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x > y){
            System.out.printf("Maior: %.2f", x);
        }
        else{
            System.out.printf("Maior: %.2f", y);
        }

        sc.close();
    }
}
