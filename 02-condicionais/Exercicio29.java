package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.print("(1)Qual é a soma de 50 + 50 ?");
        int pergunta1 = sc.nextInt();
        if(pergunta1 == 100){
            contador += 1;
            System.out.print("Resposta Correta! ");
        }
        else{
            System.out.print("Incorreto! " );
        }

        System.out.print("(2)Qual é a soma de 40 + 50 ?");
        int pergunta2 = sc.nextInt();
        if(pergunta2 == 90){
            contador += 1;
            System.out.print("Resposta Correta! ");
        }
        else{
            System.out.print("Incorreto! " );
        }

        System.out.print("(3)Qual é a soma de 35 + 25 ?");
        int pergunta3 = sc.nextInt();
        if(pergunta3 == 60){
            contador += 1;
            System.out.print("Resposta Correta! ");
        }
        else{
            System.out.print("Incorreto! " );
        }

        System.out.print("(4)Qual é a soma de 49 + 37 ?");
        int pergunta4 = sc.nextInt();
        if(pergunta4 == 86){
            contador += 1;
            System.out.print("Resposta Correta! ");
        }
        else{
            System.out.print("Incorreto! " );
        }

        System.out.print("(5)Qual é a soma de 14 + 23 ?");
        int pergunta5 = sc.nextInt();
        if(pergunta5 == 37){
            contador += 1;
            System.out.print("Resposta Correta! ");
        }
        else{
            System.out.print("Incorreto! " );
        }

        System.out.printf("Total de respostas corretas: %d", contador);

        sc.close();
    }
}
