package Day05.Inheritance;

public class Pikachu {
	// 클래스 : 객체를 정의하는 설계도
	// 멤버 : 변수, 메소드

	// 변수
	public int energy;
	public String type;

	// 생성자 정의(클래스 이름과 동일)
	// : 객체가 생성될 때 실행되는 메소드라고 생각하자.
	public Pikachu() {

		this(100, "thunder");
//	=> 아래를 한  줄로 표현
//		this.energy = 100;
//		this.type = "thunder";
		System.out.println("피카츄 객체 생성...");
	}

//		생성자 자동 완성 단축키 : Alt + shift + s => o에 밑줄이 그어진 것
//	 	매개변수가 있는 생성자
//		메소드(생성자) 오버로딩

	public Pikachu(int energy, String type) {
// 위에 이미 energy와 type를 선언했기 때문에 
// 매개변수를 받는 다른 에너지, 타입과 구분을 주고 해당 객체의 값을 사용하기 위해 this.를 붙여줌
//	this. : 그 객체가 갖고있는 energy,type을 사용하겠다는 의미.

		this.energy = energy;
		this.type = type;

		// this를 사용하지 않을 경우 ()안의 이름을 2를 붙여 바꿔준 다음
//		energy = energy2;
//		type = type2;

	}

	// 메소드
	// 접근지정자 반환타입 메소드명(매개변수) {};
	public String aAttack() {
		// return
		// 1. 메소드를 종료
		// 2. 메모리 공간을 해제
		// 3. (값)을 메소드를 호출한 자리로 반환
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}
}
