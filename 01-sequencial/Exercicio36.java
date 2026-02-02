package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[]args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do cilindro circular: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o raio de um cilindro circular: ");
        double raio = sc.nextDouble();

        double volume = 3.141592 * Math.pow(raio, 2) * altura;

        System.out.printf("Volume: %.2f", volume);

        sc.close();
    }
}
