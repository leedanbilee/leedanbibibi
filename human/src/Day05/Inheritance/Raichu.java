package Day05.Inheritance;

// 상속 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {

	String aAttack ;
	String bAttack ;
	
	// 생성자 자동완성 단축키
	// Alt + shift + S : C
	
	public Raichu() {
		super(200,"super-thunder");
	}
	public Raichu(int energy , String type) {
		super(energy, type);


		// 메소드 오버라이딩 : 메소드 재정의
		// Alt + shift + S : V
	}
	public Raichu(int energy , String type, String aAttack,String bAttack) {
		super(energy, type);
		this.aAttack = aAttack;
		this.bAttack = bAttack;
	}
//  부모클래스인 Pikachu에 이미 같은 메소드 이름의 aAttack과 bAttack이 있기 때문에
//	다른 값의 a,b Attack을 정의할 경우 오버라이딩. ----> 한 개의 메소드에 매개변수를 여러개 선언하는 것.
	
	
	@Override // @ : 어노테이션  
	public String aAttack() {
		return aAttack;
	}
	@Override
	public String bAttack() {
		return bAttack;
	}
	
	
	
	
}
