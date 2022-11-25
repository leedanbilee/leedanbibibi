package Day03;

import java.util.Scanner;

public class Ex02_Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("학점: ");
		//A, B, C, D, E, F 
		// sc.next(); 		--> (string)
		// toUpperCase() 	--> 소문자로 입력해도 대문자로 자동 변환하고 싶을때
		// charAt(0)		--> 문자열에서 문자를 해당 index의 추출 --> (char)
		// "ABC"			--> A(0), B(1), C(2)
		char grade =  sc.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("90~100점 입니다.");
			break;
		case 'B':
			System.out.println("80~89점 입니다.");
			break;
		case 'C':
			System.out.println("70~79점 입니다.");
			break;
		case 'D':
			System.out.println("60~69점 입니다.");
			break;
		case 'E':
			System.out.println("60점 미만입니다.");
			break;

		default:
			System.out.println("A~F 사이의 문자를 입력해주세요");
			break;
		}
	sc.close();
	
	}
}
