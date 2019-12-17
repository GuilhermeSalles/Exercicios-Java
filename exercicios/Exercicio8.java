package exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double galoes,res = 0;
        
        System.out.print("Quantos galões:");
        galoes = sc.nextDouble();
        
        res = galoes * 3.7854;
        
        System.out.printf("Total de litros: %.2f\n",res);
        sc.close();
    }
    
}
