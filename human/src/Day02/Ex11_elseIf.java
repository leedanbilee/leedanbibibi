package Day02;

import java.util.Scanner;

public class Ex11_elseIf {

	 public static void main(String[] args) {
		
		 // 도전
		 // system에서 정수를 하나 입력받아서,
		 // 90 이상이면 A
		 // 80 이상이면 B
		 // 70 이상이면 C
		 // 60 미만이면 F
		 // 학점을 출력하는 프로그램을 작성하시오.
		 
		 Scanner sc = new Scanner(System.in); //표준 입출력문 ->  scanner
		 System.out.println("점수 : ");
			int input = sc.nextInt();
			// input을 score라고 해도 됨. 자기 마음.
			String result = "";
			
			// {}는 메인 안에 하나만 있어도 되므로 생략 가능
			// sysout 안하고 result로 표현할 수도 있음.
			// 대신 마지막에 sysout 출력 문구 추가하기.
			
			if (input >= 90)  
				result = "A";
			else if (input >= 80 )
				result = "B";
			else if (input >= 70 )
				result = "C";
			else if (input >= 60 )
				result = "D";
			else
				result = "F";
			
		
			// 위와 동일
			// else if (input < 60 ) {
			//	System.out.println("F");
			//}
		System.out.println("학점은 " + result + " 입니다.");	
			sc.close();
	}
}
