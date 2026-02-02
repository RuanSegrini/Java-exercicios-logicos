package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salario para o reajuste de 25%: R$");
        double salario = sc.nextDouble();

        double reajuste = salario + salario * 25/100;

        System.out.printf("Reajuste salarial: R$%.2f", reajuste);

        sc.close();
    }
}
