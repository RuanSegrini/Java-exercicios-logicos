package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario: R$");
        double salarioBase = sc.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioLiquido = salarioBase + gratificacao - imposto;

        System.out.printf("Pagamento: R$%.2f", salarioLiquido);

        sc.close();
    }
}
