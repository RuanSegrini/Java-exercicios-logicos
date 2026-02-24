package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Informe um numero entre 1 e 7 para saber o dia da semana correspondente: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda-Feira");
                break;
            case 3:
                System.out.print("Terça-Feira");
                break;
            case 4:
                System.out.print("Quarta-Feira");
                break;
            case 5:
                System.out.print("Quinta-Feira");
                break;
            case 6:
                System.out.print("Sexta-Feira");
                break;
            case 7:
                System.out.print("Sabado");
                break;
            default:
                System.out.print("Numero invalido! Digite um valor entre 1 e 7.");
        }

        sc.close();
    }
}
