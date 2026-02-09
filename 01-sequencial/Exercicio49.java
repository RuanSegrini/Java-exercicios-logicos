package sequencial;

import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int h1 = sc.nextInt();

        System.out.print("Minuto inicial: ");
        int m1 = sc.nextInt();

        System.out.print("Segundo inicial: ");
        int s1 = sc.nextInt();

        System.out.print("Duração - horas: ");
        int h2 = sc.nextInt();

        System.out.print("Duração - minutos: ");
        int m2 = sc.nextInt();

        System.out.print("Duração - segundos: ");
        int s2 = sc.nextInt();

        int inicioSeg = h1 * 3600 + m1 * 60 + s1;
        int duracaoSeg = h2 * 3600 + m2 * 60 + s2;

        int total = (inicioSeg + duracaoSeg) % 86400;

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

        sc.close();
    }
}
