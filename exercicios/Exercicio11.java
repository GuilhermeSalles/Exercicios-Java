package exercice;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mega;
		
		System.out.print("Digite o valor da mega sena:");
		mega = sc.nextDouble();
		double a = 20, b = 30, c = 10;
		
		double res1 = (a/110)*mega;
		double res2 = (b/110)*mega;
		double res3 = (c/110)*mega;
		
		System.out.printf("%.2f\n",res1);
		System.out.printf("%.2f\n",res2);
		System.out.printf("%.2f\n",res3);
		
		sc.close();

	}

}
