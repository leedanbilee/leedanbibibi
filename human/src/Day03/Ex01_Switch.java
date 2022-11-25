package Day03;

import java.util.Scanner;

public class Ex01_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		switch (a) {
		case 1:
				System.out.println("1번 선택");
				break;
		case 2:
				System.out.println("2번 선택");
				break;
		case 3:
				System.out.println("3번 선택");
				break;
		default:
				System.out.println("1~3번 중에 선택해주세요.");
				break;
		}
	}
}
