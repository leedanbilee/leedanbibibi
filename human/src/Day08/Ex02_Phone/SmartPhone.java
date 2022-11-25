package Day08.Ex02_Phone;

public class SmartPhone extends Phone {
// phone 클래스에 기본생성자가 있다면 Smartphone클래스에 생성자를 생성하지 않아도 에러가 나지않음.
// SmartPhone 기본생성자 생성.
// Phone 생성자 호출되어야함(부모것이 먼저 실행되고 자식것이 실행되기때문에 동일형태여야함)
//	- > 그런데 부모 클래스에 기본 생성자가 생성이 안되어있기 때문에 오류나는것.
// -> 그렇기 때문에 아래와 같은 모양의 생성자를 기입해줘야 부모클래스에서 같은 형태의 생성자를 불러오고 오류가 나지 않음.
	
	
	// 생성자
	public SmartPhone(String Owner) {
		super(Owner);
	}
//	public SmartPhone() { 	--> SmartPhone의 기본생성자
//		super(Owner); 		--> 부모클래스의 매개변수가 있는 생성자를 불러옴.
//							--> 오류가 나지 않음.
	

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다...");
	}






}
