package Day04;

import java.util.Scanner;

public class Ex06_ZigZag {

/*
 하나의 정수N을 입력받아 다음과 같이 작성하시오..
 지그재그로 출력하시오.
 N이 5라면 다음과 같이 출력한다.
 
  1  2  3  4  5 
  10 9  8  7  6
  11 12 13 14 15
  20 19 18 17 16
  21 22 23 24 25
 */
	/* 	1. 변수 선언
	 *     증가하는 수 k 선언
	 *     N 선언
	   	2. 2차원 배열 arr선언
	   	3. 정수 N 입력
		4. 2차원 배열 지그재그로 채우기
		- 홀수행:  정방향으로→ 증가
		- 짝수행 : 역방향으로← 증가
		(번갈아 가면서 방향전환)
		5. 한 사이클마다 증감방향 전환
		6. 출력
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = 1; 		// 증가하는 수
		int sw = 1; 	// 방향 전환수
		//N X N의 2차원 배열 선언
		int arr[][] = new int[N][N];
	
		for (int i = 0; i < arr.length; i++) {
			// 정방향
			if( sw == 1) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = k++;
					// [0][1][2][3][4]  1 2 3 4 5
					// [0]
					// [0]
					// [0]
					// [0]
				}
			}
			// 역방향
			if( sw == -1) {
				for (int j = N-1; j >= 0; j--) {
					arr[i][j] = k++;
				}
			}
			// 방향 전환
			sw *= (-1);
		}
		
		for (int i = 0; i < arr.length; i++) {		
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
