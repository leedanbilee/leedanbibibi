package Day09.Ex04_OutterInner;
// 아우터, 이너클래스의 이름이 같을 때, 이너에서 아우터에 접근하는 방법.

// 아우터 클래스
public class Outter {
	
	String name = "아우터 클래스";
	
	void method() {
		System.out.println("아우터 클래스");
		
	}
	// 이너클래스
	class Inner{
		String name = "이너 클래스";
		
		void method() {
			System.out.println("이너 클래스");
		}
		
		void print() {
			System.out.println(this.name);
			this.method();
			
			// 이너 클래스에서 아우터 클래스 접근하기
			// 아우터클래스.this.변수
			// 아우터클래스.this.메소드()
			System.out.println(Outter.this.name);
			Outter.this.method();
			
		}
	}
}
