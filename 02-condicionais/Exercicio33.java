package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {


        public static void main(String[]args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double reajuste = 0;

            System.out.print("Informe o preço do produto: ");
            double preco = sc.nextDouble();

            if(preco < 50){
                reajuste = preco + (0.05 * preco);
            }
            else if(preco <= 100){
                reajuste = preco + (0.1 * preco);
            }
            else{
                reajuste = preco + (preco * 0.15);
            }

            System.out.printf("Novo preço apos reajuste: R$%.2f%n", reajuste);
            if(reajuste <= 80){
                System.out.print("Barato! ");
            }
            else if(reajuste <= 120){
                System.out.print("Normal! ");
            }
            else if(reajuste <= 200){
                System.out.print("Caro! ");
            }
            else{
                System.out.print("Muito Caro! ");
            }

            sc.close();
        }
    }
