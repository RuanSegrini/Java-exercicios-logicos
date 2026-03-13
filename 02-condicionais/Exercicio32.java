package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double preco = 0;

        System.out.print("Informe o codigo do produto escolhido do cardapio: ");
        int codigo = sc.nextInt();
        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        if(codigo == 100){
            preco = 1.20;
        }
        else if(codigo == 101){
            preco = 1.30;
        }
        else if(codigo == 102){
            preco = 1.50;
        }
        else if(codigo == 103){
            preco = 1.20;
        }
        else if(codigo == 104){
            preco = 1.70;
        }
        else if(codigo == 105){
            preco = 2.20;
        }
        else if(codigo == 106){
            preco = 1.00;
        }
        else{
            System.out.print("Código Invalido! ");
            sc.close();
            return;
        }

        double valorTotal = preco * quantidade;

        System.out.printf("Valor total: R$%.2f", valorTotal);
    }
}
