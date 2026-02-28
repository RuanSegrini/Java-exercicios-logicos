package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[]args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um ano para saber se ele é bissexto: ");
        int ano = sc.nextInt();

        if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
            System.out.print("ANO BISSEXTO!");
        }
        else{
            System.out.print("ANO NÃO BISSEXTO! ");
        }

        sc.close();
    }
}
