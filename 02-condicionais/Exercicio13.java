package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota das 3 provas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double notaTotal = nota1 + nota2 + (nota3 * 2);
        double media = notaTotal / 4;

        System.out.printf("Media: %.2f%n", media);
        
        if(notaTotal >= 60.0){
            System.out.print("APROVADO! ");
        }
        else{
            System.out.print("REPROVADO! ");
        }

        sc.close();
    }
}
