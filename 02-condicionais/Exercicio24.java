package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double produto = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe o estado destino do produto: ");
        String estado = sc.nextLine().toUpperCase();

        double imposto = 0;

        if(estado.equals("MG")) imposto = 0.07;
        else if(estado.equals("SP")) imposto = 0.12;
        else if(estado.equals("RJ")) imposto = 0.15;
        else if(estado.equals("MS")) imposto = 0.08;
        else {
            System.out.println("ESTADO INVALIDO!");
            return;
        }

        double precoFinal = produto + (produto * imposto);
        System.out.println("Preço final: R$ " + precoFinal);

        sc.close();
    }
}
