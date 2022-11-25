package Day09.Ex03_LocalNestedClass;

class A{
	int a = 100;						// 멤버 변수
	
	void methodA() {
		int b = 200;					// 지역 변수
		
		class B {						// 로컬 이너 클래스
			void methodB() {
				a= 300;
//				b= 400;					// b는 methodA의 지역변수 
//				로컬 이너 클래스에서 사용하는 지역변수는 자동으로 final 로 선언
//				final 변수는 상수가 되기때문에 값 변경 불가

				System.out.println(a);
				System.out.println(b);
				
			}
		}
		// 로컬 이너 크래스 객체 생성
		B bobj = new B();
		bobj.methodB();
		
		// class A에서 로컬 이너 클래스 객체가 생성된 후 classB {}로 이동함.
	}
}
public class LocalNestedClass {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}
