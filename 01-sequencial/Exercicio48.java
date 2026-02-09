package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio48 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro em segundos para converter em horas,minutos e segundos: ");
        int N = sc.nextInt();

        int horas = N / 3600;
        int minutos = N / 60 - (horas * 60);
        int segundos = N - (horas * 3600) - (minutos * 60);

        System.out.printf("Horas:  %02d:%02d:%02d", horas, minutos, segundos);

        sc.close();
    }
}
