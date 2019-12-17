package exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double R = 0, volCaixa = 0, volEsfera = 0,res = 0;
          
        System.out.print("Digite o raio da esfera:");
        R = sc.nextDouble();
        
        volCaixa = Math.pow(R, 3);
        volEsfera =  (4 * 3.14 * Math.pow(6, 3)) / 3;
        
        res = Math.floor(volCaixa/volEsfera);
        
        System.out.printf("Cabem %.0f esferas.\n",res);
        
        sc.close();
    }
    
}
