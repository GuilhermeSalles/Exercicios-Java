package exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A , res1, res2, res3;
        System.out.println("Digite um número:");
        A = sc.nextInt();
        res1 = (A + 1) * 3;
        res2 = (A - 1) * 2;
        res3 = res1 + res2;
                
        System.out.printf("Resulta em: %d\n", res3);
        
        sc.close();
    }
    
}
