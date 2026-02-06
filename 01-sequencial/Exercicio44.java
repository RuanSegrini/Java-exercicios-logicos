package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do degrau de uma escada: ");
        double degrauAtual = sc.nextDouble();
        System.out.print("Altura que deseja alcançar: ");
        double degrauAlcancar = sc.nextDouble();

        int quantidadeDegraus =(int) Math.ceil(degrauAlcancar / degrauAtual);

        System.out.printf("Falta %.2f degraus", quantidadeDegraus);

        sc.close();
    }
}
