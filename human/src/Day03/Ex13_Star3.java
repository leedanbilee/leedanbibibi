package Day03;

import java.util.Scanner;

import javax.crypto.spec.RC2ParameterSpec;

public class Ex13_Star3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			for (int j = 1 ; j <= i-1 ; j++) {
				// i 1 j 0
				// i 2 j 1
				
			System.out.print(" ");
			}
			for (int k = (N+1)-i ; k >= 1 ; k--) {
			System.out.print("*");
			}
			System.out.println();
		sc.close();
		}
	}
}
