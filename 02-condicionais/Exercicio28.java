package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe tres numeros inteiros positivos: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        System.out.println(" (1) Geométrica\n (2)Ponderada\n (3)Harmonica\n (4)Aritimética\n Informe a média que voce deseja:");
        int N = sc.nextInt();

        if(N == 1){
            double mediaGeometrica = Math.cbrt(x * y * z);
            System.out.printf("Média: %.2f", mediaGeometrica);
        }
        else if(N == 2){
            double mediaPonderada = (x + 2 * y + 3 * z) / 6;
            System.out.printf("Média: %.2f", mediaPonderada);
        }
        else if(N == 3){
            double mediaHarmonica = 1 / ((1/x) + (1/y) + (1/z));
            System.out.printf("Média: %.2f", mediaHarmonica);
        }
        else if(N == 4){
            double mediaAritimetica = (x + y + z) / 3;
            System.out.printf("Média: %.2f", mediaAritimetica);
        }
        else{
            System.out.print("Valor invalido! ");
        }

        sc.close();
    }
}
