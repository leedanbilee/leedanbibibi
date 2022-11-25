package Day05;

import java.util.Scanner;

/* 변수 주문 번호, 주문 개수
 *     orderno,   order
 * do
 * ######### 치킨메뉴판 #########
 * 1. 교촌 - 허니콤보치킨
 * 2. BBQ - 황금올리브반반치킨
 * 3. 도미노피자(알볼로피자) 
 * 4. 시장통닭
 * 0. 종료
	########### 입력 : (scanner)

	메뉴 번호에 따라 메뉴 변수에 해당 메뉴를 저장해주고
	"(해당메뉴)가 주문되었습니다" 라고 출력하시오.
	do종료
	
 	0 을 입력하기 전까지 반복하고,
 	0 을 입력하면 반복을 종료합니다.
 	종료 시, "?개의 주문을 완료하였습니다." 라고 출력하시오. while 
*/
// do,while문

public class Ex05_Chickenmenu {
	// 메소드 : 코드의 모음
	// 메소드 정의 문법
	// [접근지정자] (static) [반환타입] [메소드명] (매개변수1, 매개변수2) {코드모음;}
	// 메소드 호출
	// 메소드명( 인자1, 인자2 );  --------> 인자는 없을수도 있음
	public static void showMenu() {
		// ()안의 값은 매개변수, 아무것도 없을 땐 작성하지 않음
		// 들여쓰기 : tab
		// 내어쓰기 : shift + tab
		// 코드정리 : ctrl + shift + F
		
		// 메뉴판 출력
		System.out.println("######### 치킨메뉴판 #########");
		System.out.println("1. 교촌 - 허니콤보치킨");
		System.out.println("2. BBQ - 황금올리브반반치킨");
		System.out.println("3. 도미노피자(알볼로피자)");
		System.out.println("4. 시장통닭");
		System.out.println("0. 종료");
		System.out.println("########### 입력 :");
	}
	public static void main(String[] args) {
			
		int count = 0;
		int menuNo = 0; 		// 메뉴번호
		String menuName = ""; 	// 메뉴이름
		Scanner sc = new Scanner(System.in);
		
		do {
			showMenu(); // 메소드 호출 (맨 위에서 메뉴판 메소드 이미 작성함, 그 메소드를 불러오는것) 
			// ()안의 값은 전달인자 ---> 전달인자가 맨 위의 호출한 메소드에 매개변수로 입력되는것.
			menuNo = sc.nextInt();
			
			if (menuNo == 0) break;
			
			switch ( menuNo ) {
				case 1 : menuName = "허니콤보치킨";
						break;
				case 2 : menuName = "황금올리브 반반치킨";
						break;
				case 3 : menuName = "도미노피자";
						break;
				case 4 : menuName = "시장통닭";
						break;
				default : menuName = "(선택안함)";
						break;
				}
			//유효성 검사 - 메뉴번호는 0~4번까지만 가능
				if( menuNo >= 0 && menuNo <= 4) {
					if(menuNo != 0) { 	// -> 과제로 추가한 항목
						++count; 		// -> 과제로 추가한 항목
					}
					System.out.println(menuName + "이 주문되었습니다.");
				}else {
					System.out.println("0~4번 사이의 숫자를 입력해주세요");
				}
		}
			while(menuNo != 0);
		System.out.println(count + "개의 주문을 완료하였습니다."); // -> 과제로 추가한 항목
				
		sc.close();
	}
}
