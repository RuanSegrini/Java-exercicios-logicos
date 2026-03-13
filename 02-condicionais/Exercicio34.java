package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        double nota = sc.nextDouble();

        System.out.print("Informe o número de faltas: ");
        int faltas = sc.nextInt();

        if(nota >= 9 && nota <= 10){
            if(faltas <= 20){
                System.out.println("A");
            } else{
                System.out.println("B");
            }
        }
        else if(nota >= 7.5){
            if(faltas <= 20){
                System.out.println("B");
            } else{
                System.out.println("C");
            }
        }
        else if(nota >= 5){
            if(faltas <= 20){
                System.out.println("C");
            } else{
                System.out.println("D");
            }
        }
        else if(nota >= 4){
            if(faltas <= 20){
                System.out.println("D");
            } else{
                System.out.println("E");
            }
        }
        else if(nota >= 0){
            System.out.println("E");
        }
        else{
            System.out.println("VALOR INVALIDO!");
        }

        sc.close();
    }
}
