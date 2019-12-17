package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double peso, res = 0;
        System.out.print("Digite seu peso:");
        peso = sc.nextDouble();
        
        res =(peso * 17) / 100;
        
        System.out.printf("Seu peso %.2f.\n",res);
        
        sc.close();
    }
    
}
