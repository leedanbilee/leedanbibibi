package Day10.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String menuName = " ";
		int menuNo = 0;
		
		do {
		System.out.println("1. Java");
		System.out.println("2. HTML");
		System.out.println("3. CSS");
		System.out.println("4. JavaScript");
		System.out.println("0. 종료");
		
		System.out.println(" 메뉴 입력 : ");
		
		try { 
			menuNo = sc.nextInt();
		}
		
		catch (InputMismatchException e ) {
			sc.next();
			System.out.println("(0~4)사이의 정수를 입력해주세요");
			continue;
		}
		
		if( menuNo == 0 ) break;
		
		switch ( menuNo) {
			case 1: menuName = "Java";
					break;
			case 2: menuName = "HTML";
					break;
			case 3: menuName = "CSS";
					break;
			case 4: menuName = "JavaScript";
					break;
			default:menuName = "선택없음";
					break;
		}
		System.out.println(menuName + "을/를 공부합니다.");
		} while ( true);
		sc.close();
		
	}
}
