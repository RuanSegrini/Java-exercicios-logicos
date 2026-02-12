package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 2 notas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        if (nota1 < 0.0 || nota1 > 10.0 || nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Nota inválida! ");
        }
        else{
            double media = (nota1 + nota2) / 2;
            System.out.printf("Média: %.2f", media);
        }

        sc.close();
    }
}
