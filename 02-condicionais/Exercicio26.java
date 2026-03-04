package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a distancia em Km percorrido: ");
        double distancia = sc.nextDouble();
        System.out.print("Informe a quantidade de litros de gasolina consumido: ");
        double gasolinaGasta = sc.nextDouble();

        double consumo = distancia / gasolinaGasta;

        System.out.printf("Consumo = %.2f km/l%n", consumo);

        if(consumo < 8){
            System.out.println("VENDA O CARRO!");
        }
        else if(consumo <= 14){
            System.out.println("ECONOMICO!");
        }
        else{
            System.out.println("SUPER ECONOMICO!");
        }

        sc.close();
    }
}
