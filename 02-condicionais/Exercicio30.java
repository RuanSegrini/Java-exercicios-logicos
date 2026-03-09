package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe tres numeros: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        if(x <= y && x <= z){
            if(y <= z){
                System.out.printf("Números em ordem crescente: %.1f, %.1f, %.1f", x, y, z);
            } else{
                System.out.printf("Números em ordem crescente: %.1f, %.1f, %.1f", x, z, y);
            }
        }
        else if(y <= x && y <= z){
            if(x <= z){
                System.out.printf("Números em ordem crescente: %.1f, %.1f, %.1f", y, x, z);
            } else{
                System.out.printf("Números em ordem crescente: %.1f, %.1f, %.1f", y, z, x);
            }
        }
        else{
            if(x <= y){
                System.out.printf("Números em ordem crescente: %.1f, %.1f, %.1f", z, x, y);
            } else{
                System.out.printf("Números em ordem crescente: %.1f, %.1f, %.1f", z, y, x);
            }
        }

        sc.close();
    }
}
