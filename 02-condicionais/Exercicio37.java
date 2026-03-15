package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora de entrada: ");
        int horaEntrada = sc.nextInt();
        int minutoEntrada = sc.nextInt();

        System.out.print("Hora de saída: ");
        int horaSaida = sc.nextInt();
        int minutoSaida = sc.nextInt();

        int entradaMin = horaEntrada * 60 + minutoEntrada;
        int saidaMin = horaSaida * 60 + minutoSaida;

        if (saidaMin <= entradaMin) {
            saidaMin += 24 * 60;
        }

        int tempo = saidaMin - entradaMin;

        int horas = tempo / 60;
        if (tempo % 60 != 0) {
            horas++;
        }

        double preco = 0;

        if (horas <= 2) {
            preco = horas * 1.0;
        }
        else if (horas <= 4) {
            preco = 2 * 1.0 + (horas - 2) * 1.4;
        }
        else {
            preco = 2 * 1.0 + 2 * 1.4 + (horas - 4) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", preco);

        sc.close();
    }
}
