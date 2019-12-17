package exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int idade = 0, conta = 0;
        
        System.out.print("Digite sua idade para ser convertida em dias: ");
        idade = sc.nextInt();
        
        conta = idade * 365;
        System.out.printf("Idade digitada foi %d, sua idade em dias é: %d\n",idade,conta);
        sc.close();
    }
    
}
