package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero inteiro entre 1 e 12 para saber o mes correspondente: ");
        int mes = sc.nextInt();

        switch(mes){
            case 1:
                System.out.print("Janeiro");
                break;
            case 2:
                System.out.print("Fevereiro");
                break;
            case 3:
                System.out.print("Março");
                break;
            case 4:
                System.out.print("Abril");
                break;
            case 5:
                System.out.print("Maio");
                break;
            case 6:
                System.out.print("Junho");
                break;
            case 7:
                System.out.print("Julho");
                break;
            case 8:
                System.out.print("Agosto");
                break;
            case 9:
                System.out.print("Setembro");
                break;
            case 10:
                System.out.print("Outubro");
                break;
            case 11:
                System.out.print("Novembro");
                break;
            case 12:
                System.out.print("Dezembro");
                break;
            default:
                System.out.print("Numero invalido! Digite um valor entre 1 e 12.");
        }

        sc.close();
    }
}
