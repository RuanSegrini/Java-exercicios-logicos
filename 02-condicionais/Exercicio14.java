package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do trabalho de laboratorio: ");
        double notaLaboratorio = sc.nextDouble();
        System.out.print("Informe a nota da avaliação semestral: ");
        double notaAvaliacao = sc.nextDouble();
        System.out.print("Informe a nota do exame final: ");
        double notaExameFinal = sc.nextDouble();

        double notaFinal = (notaLaboratorio * 2) + (notaAvaliacao * 3) + (notaExameFinal * 5) / 10;

        if (notaFinal < 2.9){
            System.out.print("REPROVADO! ");
        }
        else if(notaFinal < 4.9){
            System.out.print("RECUPERAÇÃO! ");
        }
        else{
            System.out.print("APROVADO! ");
        }

        sc.close();
    }
}
