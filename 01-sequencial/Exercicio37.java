package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto para aplicar o desconto de 12%: ");
        double preco = sc.nextDouble();

        double precoTotal = preco - preco * 12/100;

        System.out.printf("Valor com desconto: R$%.2f", precoTotal);

        sc.close();
    }
}
