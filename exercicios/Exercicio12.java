package exercice;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1,N2;
		
		System.out.print("Digite N1:");
		N1 = sc.nextInt();
		System.out.print("Digite N1:");
		N2 = sc.nextInt();
		
		
		if(N1 > N2) {
			System.out.printf("O maior numero é %d, a diferença entre eles é %d",N1,N1-N2);
		}else {
			System.out.printf("O maior numero é %d, a diferença entre eles é %d",N2,N2-N1);
		}
		

		sc.close();

	}

}
