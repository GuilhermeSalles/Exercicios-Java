package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double c, p , s, t;
        System.out.print("Digite o valor:");
        c = sc.nextDouble();
        
        p = c * 46 / 100;
        s = c * 32 / 100;
        t = c * 22 / 100;
        
        System.out.printf("1° ganhador: %.2f. \n2° ganhador: %.2f. \n3° ganhador: %.2f.\n",p,s,t);
        sc.close();
    }
    
}
