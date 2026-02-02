package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {


    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamnho do lado do quadrado: ");
        int ladoQuadrado = sc.nextInt();

        int areaQuadrado = ladoQuadrado * 4;

        System.out.printf("Area do quadrado: %d", areaQuadrado);

        sc.close();
    }
}
