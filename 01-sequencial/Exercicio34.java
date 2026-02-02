package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio de um circulo: ");
        double raioCirculo = sc.nextInt();

        double areaCirculo = 3.141592 * Math.pow(raioCirculo, 2);

        System.out.printf("Area do quadrado: %.2f", areaCirculo);

        sc.close();
    }
}
