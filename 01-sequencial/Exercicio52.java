package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio52 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome dos apostadores: ");
        String apostador1 = sc.nextLine();
        String apostador2 = sc.nextLine();
        String apostador3 = sc.nextLine();

        System.out.print("Quanto o " + apostador1 + " deu para realizaçao da aposta: R$");
        double apostador1Valor = sc.nextDouble();
        System.out.print("Quanto o " + apostador2 + " deu para realizaçao da aposta: R$");
        double apostador2Valor = sc.nextDouble();
        System.out.print("Quanto o " + apostador3 + " deu para realizaçao da aposta: R$");
        double apostador3Valor = sc.nextDouble();
        System.out.print("Digite o valor do premio: R$");
        double valorPremio = sc.nextDouble();

        double totalInvestido = apostador1Valor + apostador2Valor + apostador3Valor;
        double porcentagemApostador1 = apostador1Valor * 100 / totalInvestido;
        double porcentagemApostador2 = apostador2Valor * 100 / totalInvestido;
        double porcentagemApostador3 = apostador3Valor * 100 / totalInvestido;

        double premioApostador1 = (porcentagemApostador1 / 100) * valorPremio;
        double premioApostador2 = (porcentagemApostador2 / 100) * valorPremio;
        double premioApostador3 = (porcentagemApostador3 / 100) * valorPremio;

        System.out.println("Total investido: R$ " + totalInvestido);

        System.out.println("Apostador:" + apostador1);
        System.out.println("  Investiu: R$ " + apostador1Valor);
        System.out.printf("Porcentagem: %.2f%%%n", porcentagemApostador1);
        System.out.printf("  Prêmio: R$%.2f%n ", premioApostador1);

        System.out.println("\nApostador:" + apostador2);
        System.out.println("  Investiu: R$ " + apostador2Valor);
        System.out.printf("Porcentagem: %.2f%%%n", porcentagemApostador2);
        System.out.printf("  Prêmio: R$%.2f%n ", premioApostador2);

        System.out.println("\nApostador:" + apostador3);
        System.out.println("  Investiu: R$ " + apostador3Valor);
        System.out.printf("Porcentagem: %.2f%%%n", porcentagemApostador3);
        System.out.printf("  Prêmio: R$%.2f%n ", premioApostador3);

        sc.close();
    }
}
