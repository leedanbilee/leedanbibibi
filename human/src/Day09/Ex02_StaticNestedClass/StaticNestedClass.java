package Day09.Ex02_StaticNestedClass;

class A {
	int a = 5;
	static int b = 15;

	void methodA() {
		System.out.println("인스턴스 메소드");
	}
	static void methodB() {
		System.out.println("static 메소드");
	}
	
	// static 이너 클래스
	// : static 변수/메소드만 접근 가능
	static class B {
		void methodC() {
			// 변수 사용 ( a는 static 변수가 아니기에 에러. 접근 불가)
//			System.out.println(a); 	static 만 사용 가능
			System.out.println(b);

			// 메소드 호출 ( A는 static 메소득 아니기에 접근 불가)
//			methodA();				static만 사용 가능
			methodB();
		}
	}
}
public class StaticNestedClass {
	public static void main(String[] args) {
		// static 이너 클래스의 객체 생성
		A.B b = new A.B();

		// 메소드 호출
		b.methodC();
	}
}
