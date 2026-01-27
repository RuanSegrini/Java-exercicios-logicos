package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com tres valores inteiros e imprima a soma deles: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int soma = x + y + z;
        
        System.out.printf("Soma dos valores informados: %d", soma);

        sc.close();
    }
}
