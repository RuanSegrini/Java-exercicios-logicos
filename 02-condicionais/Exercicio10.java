package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Informe o sexo (F/M): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        switch (sexo) {
            case 'M':
                double pesoIdealM = (72.7 * altura) - 58;
                System.out.printf("PESO IDEAL = %.2f kg", pesoIdealM);
                break;
            case 'F':
                double pesoIdealF = (62.1 * altura) - 44.7;
                System.out.printf("PESO IDEAL = %.2f kg", pesoIdealF);
                break;
        }

        sc.close();
    }
}
