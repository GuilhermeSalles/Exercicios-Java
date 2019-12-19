package exercice;

import java.util.Scanner;

public class Exercicio13 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		
		char resp;
		do {
		System.out.print("Digite um numero:");
		N = sc.nextInt();
		
		if (N % 5 == 0) {
			System.out.println("É multiplo por 5..");
		}else {
			System.out.println("Não é multiplo por 5..");
		}
		
		System.out.println("quer continuar?[S/N]");
		resp = sc.next().toLowerCase().charAt(0);
		} while (resp != 'n');
		{
			System.out.println("Byeeeee..........");
			sc.close();
		}
	}

}
