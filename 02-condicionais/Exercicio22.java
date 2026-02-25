package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade do trabalhador: ");
        int idade = sc.nextInt();
        System.out.print("Informe o tempo de serviço: ");
        int tempoServico = sc.nextInt();

        if(idade >= 65 || tempoServico >= 30 || idade + tempoServico >= 85 ){
            System.out.print("APOSENTADORIA APROVADA");
        }
        else{
            System.out.print("APOSENTADORIA NEGADA");
        }

        sc.close();
    }
}
