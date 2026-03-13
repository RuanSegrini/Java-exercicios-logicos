package condicional;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mes: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia >= 1 && dia <= 31) {
                    dataValida = true;
                }
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    dataValida = true;
                }
            }
            else if (mes == 2) {

                boolean bissexto = false;

                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    bissexto = true;
                }

                if (bissexto) {
                    if (dia >= 1 && dia <= 29) {
                        dataValida = true;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        dataValida = true;
                    }
                }
            }
        }

        if (dataValida) {
            System.out.println("Data valida");
        } else {
            System.out.println("Data invalida");
        }

        sc.close();
    }
}
