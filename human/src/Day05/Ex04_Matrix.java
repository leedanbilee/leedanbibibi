package Day05;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		// 1. 양의 정수 M과 N을 입력받아(sc.) 저장하고, 
		// 2. M행 N열의 2차원 배열을 생성한다.arr1[M][N]
		// 3. 각 요소의 값을 입력받고 , 그대로 출력하시오.
		// (입력 예시)
		// M : 2
		// N : 3
		// 1 2 3 
		// 4 5 6 
		// (출력 예시)
		// 1 2 3 
		// 4 5 6
		// 같은 과정을 한번 더, X행Y열로 입력받고 출력하시오.
		// (단, X행Y열의 2차원 배열은 foreach문을 이용하여 출력하시오.)
		
		Scanner sc = new Scanner(System.in);
		
		int M, N, X, Y;
		
		System.out.println("M:");
		M = sc.nextInt();
		System.out.println("N:");
		N = sc.nextInt();
		
		int arr1[][] = new int[M][N];
		// 2차원배열은 이중반복문으로 접근한다
		// 바깥 반복문 : i
		// 안 반복문: j
		// arr1.length : 행 크기
		// arr1[i].length : 열 크기
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) { // arr1[i] 가 arr1 [j]의 배열 이름?같은거
			
				arr1[i][j] = sc.nextInt(); // 입력
				System.out.print(arr1[i][j] + " "); // 출력		
			}
		System.out.println();
		}

		// foreach문을 이용.
		
		System.out.println("X:");
		X = sc.nextInt();
		System.out.println("Y:");
		Y = sc.nextInt();

		int arr2[][] = new int[X][Y];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		//* arr2		=> int[][]	 	(배열을 2개 품고 있음)
		//* row 		=> int[] 		(배열을 1개 (col배열)을 품고있음)
		//* col			=> 				(본인의 배열만 갖고있음)
		
		// arr2은 2차원 배열로, 2차원 배열의 요소는 1차원 배열
		// row는 1차원 배열로, 1차원 배열의 요소는 int타입의 값
		
		for ( int[] row : arr2 ) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		}
	
	}

