package exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0, antecessor =0, sucessor=0;
       
        System.out.print("Informe um número: ");
        numero = entrada.nextInt();
        sucessor = numero + 1;
        antecessor = numero - 1;
       
        System.out.printf("O número informado foi %d\nO antecessor é %d\nO sucessor é %d\n",numero,antecessor,sucessor);
        entrada.close();
    }
    
}
