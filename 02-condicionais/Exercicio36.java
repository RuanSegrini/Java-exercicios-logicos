package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double comicao;

        System.out.print("Informe o valor da venda mensal: ");
        double valorVenda = sc.nextDouble();

        if(valorVenda >= 100000){
            comicao = 700 + (0.16 * valorVenda);
        }
        else if(valorVenda >= 80000){
            comicao = 650 + (0.14 * valorVenda);
        }
        else if(valorVenda >= 60000){
            comicao = 600 + (0.14 * valorVenda);
        }
        else if(valorVenda >= 40000){
            comicao = 550 + (0.14 * valorVenda);
        }
        else if(valorVenda >= 20000){
            comicao = 500 + (0.14 * valorVenda);
        }
        else{
            comicao = 400 + (0.14 * valorVenda);
        }

        System.out.printf("Valor da comissão: R$ %.2f%n", comicao);

        sc.close();
    }
}
