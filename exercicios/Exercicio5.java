package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double C3 = 0, vol = 0;
        
        System.out.print("Digite a aresta do cubo:");
        C3 = sc.nextDouble();
         
        vol = Math.pow(C3, 2);
        
        System.out.printf("O volume do cudo é: %.2f.\n",vol);
        sc.close();
    }
    
}
