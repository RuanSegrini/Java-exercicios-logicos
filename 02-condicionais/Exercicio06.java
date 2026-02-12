package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y){
            int diferenca = x - y;
            System.out.printf("Maior = %d%n", x);
            System.out.printf("Diferença = %d", diferenca);
        }
        else{
            int diferenca = y - x;
            System.out.printf("Maior = %d%n", y);
            System.out.printf("Diferença = %d", diferenca);
        }

        sc.close();
    }
}
