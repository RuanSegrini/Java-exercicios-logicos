package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias trabalhados: ");
        int dias = sc.nextInt();

        double valorDia = 30.0;
        double salarioBruto = dias * valorDia;
        double desconto = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("Pagamento liquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
