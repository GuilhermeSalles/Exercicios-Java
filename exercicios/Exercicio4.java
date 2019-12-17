package exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        double salario = 0, percentual = 0, reajuste = 0;
        System.out.print("Digite seu sálario mensal:");
        salario = sc.nextDouble();
        System.out.print("Digite o percentual para reajuste:");
        percentual = sc.nextDouble();
        
        reajuste = (salario + percentual)/ 100 + salario;
        
        System.out.printf("Sálario com reajuste R$%.2f.\n",reajuste);
        sc.close();
    }
    
}
