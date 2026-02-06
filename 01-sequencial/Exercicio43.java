package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorBase = sc.nextDouble();

        double desconto = valorBase - (0.1 * valorBase);
        double parcela = valorBase / 3;
        double comissaoAVista = desconto * 0.05;
        double comissaoParcela = valorBase * 0.05;

        System.out.printf("Total a pagar com desconto de 10%: R$%.2f%n", desconto);
        System.out.printf("Valor do produto parcelado em 3x sem juros: R$%.2f%n", parcela);
        System.out.printf("Comissão sobre vendas a vista: R$%.2f%n", comissaoAVista);
        System.out.printf("Comissão sobre vendas parceladas: R$%.2f", comissaoParcela);

        sc.close();
    }
}
