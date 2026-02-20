package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salario do trabalhador: ");
        double salario = sc.nextDouble();
        System.out.print("Informe o valor da prestaçao de um emprestimo: ");
        double prestacao = sc.nextDouble();

        double calcularPorcentagem = 0.20 * salario;

        if(prestacao > calcularPorcentagem){
            System.out.print("EMPRESTIMO NAO CONCEDIDO! ");
        }
        else{
            System.out.print("EMPRESTIMO CONCEDIDO! ");
        }

        sc.close();
    }
}
