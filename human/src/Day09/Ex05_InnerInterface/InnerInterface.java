package Day09.Ex05_InnerInterface;

class A {
	
	// 이너 인터페이스
	// : 클래스 내부에 정의한 인터페이스
	//- 인터페이스가 해당 클래스에 의존적인 기능을 정의할 때,
	//  이너 인터페이스로 작성한다.
	//  ex. 이벤트 처리 코드를 작성할 때 주로 사용
	
	//  이너 인터페이스는 자동으로 static으로 지정
	interface B {

		//(public abstract) 생략가능
		public abstract void method();
		
	}
}
class C implements A.B {

	@Override
	public void method() {
		System.out.println("이너 인터페이스 구현 클래스");
	}
	
}
public class InnerInterface {

	public static void main(String[] args) {
		// 객체 생성 - 방법 1
		// 아우터클래스.이너인터페이스 객체명 = new 구현클래스
		A.B ab = new C();
		C c = new C();
		c.method();
		
		// 객체 생성 - 방법 2 (익명 이너 객체 생성)
		// 아우터클래스.이너인터페이스 객체명 = new 아우터클래스.이너인터페이스(){ };
		// 익명 이너 클래스
		// : 이름없는 구현 클래스를 객체 생성 시 정의
		A.B b = new A.B() {

			@Override
			public void method() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
				
		};
		
		b.method();
		
		
		
		
	}
}
