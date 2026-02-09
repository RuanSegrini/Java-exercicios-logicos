package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("Já fez aniversário este ano? (1=sim, 0=nao): ");
        int fezAniversario = sc.nextInt();

        int anoNascimento = anoAtual - idade - (1 - fezAniversario);


        System.out.printf("Ano de nascimento: %d", anoNascimento);

        sc.close();
    }
}
