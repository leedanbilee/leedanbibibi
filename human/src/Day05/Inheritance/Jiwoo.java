package Day05.Inheritance;


// 한 번에 import 하기 : ctrl + shift + O
public class Jiwoo {
	
	
	//	main() : 프로그램이 시작되는 메소드
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 객체명 = new 클래스명();
		
//		 객체 1
		Pikachu pikachu = new Pikachu();
		// 객체 pikachu는 우리가 직접 지은것
		// Pikichu() 안에 값이 아무것도 없으면 Pikachu에서 불러옴/
		
		// (.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
//		pikachu.energy = 100;
//		pikachu.type = "thunder";
		// 객체가 생성될 때 실행되는 메소드 ----> 
		
		System.out.println("########## 피카츄 #########");
		System.out.println("에너지: " + pikachu.energy);
		System.out.println("타입: " + pikachu.type);
		System.out.println("공격 A " + pikachu.aAttack());
		System.out.println("공격 B " + pikachu.bAttack());
		
//		객체2
		Pikachu pikachu20 = new Pikachu(150,"진화");
		// 위에 Pikachu에서 언급해 준 값이 없어 생성자에서 불러오기 때문에
		//오류 발생
		System.out.println("########## 피카츄(Lv.20) #########");
		System.out.println("에너지: " + pikachu20.energy);
		System.out.println("타입: " + pikachu20.type);
		System.out.println("공격 A " + pikachu20.aAttack());
		System.out.println("공격 B " + pikachu20.bAttack());
		System.out.println();
	
		// 라이츄 객체를 기본생성하고 출력해보시오.
		Raichu raichu = new Raichu();
		raichu.aAttack = "ㄷㄷㄷㄷㄷ";
		raichu.bAttack = "ㄷㄷㄷㄷㄷ";
		
				
		System.out.println("########## 라이츄 #########");
		System.out.println("에너지: " + raichu.energy);
		System.out.println("타입: " + raichu.type);
		System.out.println("공격 A " + raichu.aAttack());
		System.out.println("공격 B " + raichu.bAttack());
		System.out.println();
	
		Raichu raichu40 = new Raichu(400, " mega-thunder");
		
		System.out.println("########## 라이츄(lv.40) #########");
		System.out.println("에너지: " + raichu40.energy);
		System.out.println("타입: " + raichu40.type);
		System.out.println("공격 A " + raichu40.aAttack());
		System.out.println("공격 B " + raichu40.bAttack());
		System.out.println();
		
	
	
	
	
	
	
	
	}
}
