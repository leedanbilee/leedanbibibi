package Day03;

import java.util.Scanner;

import javax.crypto.spec.RC2ParameterSpec;

public class Ex12_Star2 {

	public static void main(String[] args) {
		// 자연수 N을 입력받아, 삼각형 모양의 "*" 출력하시오.
		// 입력 : 5
		// 출력 : 
		// ***** 	5 		1 2 3 4 5
		// **** 	4		1 2 3 4 
		// ***	 	3		1	
		// **
		// *

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			for (int j = (N+1)-i ; j >= 1 ; j--) {
			System.out.print("*");
			}
			System.out.println();
		}
		sc.close();	
		}
				
	}

