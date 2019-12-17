package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dia,mes,ano,anoAtual,V1,V2,V3;
        //Variaveis usadas para guardar a data de nascimento do usuário
        System.out.println("Digite a sua data de nascimento");
        System.out.print("Dia:");
        dia = sc.nextInt();
        System.out.print("Mes:");
        mes = sc.nextInt();
        System.out.print("Ano:");
        ano = sc.nextInt();
        // Variavel usada para guardar o ano atual 
        System.out.println("======================");
        System.out.println("Digite o ano atual:");
        anoAtual = sc.nextInt();
        //Operação para converter a data de nascimento em dias
        V1 = dia + mes * 30 + ano * 365;
        //Operação para transformar o ano atual em dias
        V2 = anoAtual * 365;
        //operação para saber os dias exatos
        V3 = V2 - V1;        
        //Saida de dados
        System.out.printf("Data transformada em dias: %d\n", V3);
        sc.close();
    }
    
}
