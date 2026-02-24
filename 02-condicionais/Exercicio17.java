package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base maior do trapezio: ");
        double baseMaior = sc.nextDouble();
        System.out.print("Informe a base menor do trapezio: ");
        double baseMenor = sc.nextDouble();
        System.out.print("Informe a altura do trapezio: ");
        double altura = sc.nextDouble();

        if(baseMaior <= 0 || baseMenor <= 0 || altura <= 0){
            System.out.print("VALOR INVALIDO! ");
        }
        else{
            double area = (baseMaior + baseMenor) * altura / 2;
            System.out.printf("AREA DO TRAPEZIO = %.2f", area);
        }

        sc.close();
    }
}
