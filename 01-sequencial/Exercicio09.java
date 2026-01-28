package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus Celsius para converter em graus Kelvin: ");
        double C = sc.nextDouble();
        
        double kelvin = C + 273.15;
        
        System.out.printf("Temperatura em kelvin: %.2f", kelvin);

        sc.close();
    }
}
