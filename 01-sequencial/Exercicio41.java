package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora de trabalho em reais: R$");
        double valorHoras = sc.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas no mes: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBase = valorHoras * horasTrabalhadas;
        double pagamento = salarioBase + (0.1 * salarioBase);

        System.out.printf("Valor que o funcionario deve receber: R$%.2f", pagamento);

        sc.close();
    }
}
