package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {
    
    public static void main(String[]args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor de area em metros quadrados para converter em hectares: ");
        double metrosQuadrados = sc.nextDouble();
        
        double hectares = metrosQuadrados * 0.0001;
        
        System.out.printf("Valor em hectares: %.2f", hectares);
        
        sc.close();
    }
}
