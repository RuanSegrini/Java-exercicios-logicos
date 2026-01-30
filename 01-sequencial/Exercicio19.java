package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    
    public static void main(String[]args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um volume em L(litros) para converter em m³(metros cubicos): ");
        double litros = sc.nextDouble();
        
        double metrosCubicos = litros / 1000;
        
        System.out.printf("Valor em m³(metros cubicos): %.2f", metrosCubicos);
        
        sc.close();
    }
}
