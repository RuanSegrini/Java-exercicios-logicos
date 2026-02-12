package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y){
            System.out.printf("Maior = %d%n", x);
            
        }
        else if(x == y){
            System.out.print("Numeros iguais! ");
        }
        else{
            System.out.printf("Maior = %d%n", y);
        }

        sc.close();
    }
}
