package Day03;

import java.util.Scanner;

public class Ex09_Gugu {

	public static void main(String[] args) {
		// 단의 반복 	: 1~9
		// 각 단의 곱 : 1~9
		// 이중 반복문
		for (int i = 1; i <= 9; i++) {
			// i : 1
			for (int j = 1; j <=9; j++) {
				// i : 1
				// j : 1,2,3,4,5,6,7,8,9
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
				// 1*1=1	1*2=2	....
			}
			System.out.println(); //한 단 끝(한 줄)	-> 다음줄로
		}
	}
}
