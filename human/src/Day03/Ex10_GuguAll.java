package Day03;

import java.util.Scanner;

public class Ex10_GuguAll {

	public static void main(String[] args) {
		// 구구단 (1~9단)
		// 원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오.
		// 입력 : 3
		// 출력 : 3*1=3
		
		Scanner sc = new Scanner(System.in);
	
		int input = sc.nextInt();
		// 9회 반복
		// (입력 단)x(반복변수:1~9) = 결과
		for (int i = 1; i <= 9; i++) {
		
			int result = input * i;
			
			System.out.println(input + "*" + i + "=" + result);
		}
		
		sc.close();
		
		
	}
}
