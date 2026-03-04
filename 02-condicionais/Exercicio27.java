package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a idade do nadador: ");
        int idade = sc.nextInt();

        if(idade <= 7){
            System.out.print("Infantil A! ");
        }
        else if(idade <= 10){
            System.out.print("Infantil B! ");
        }
        else if(idade <= 13){
            System.out.print("Juvenil A! ");
        }
        else if(idade <= 17){
            System.out.print("Juvenil B! ");
        }
        else{
            System.out.print("Senior! ");
        }

        sc.close();
    }
}
