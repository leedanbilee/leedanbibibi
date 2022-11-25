package Day09.Ex07_AnonymousClass;

public class AnonymousEx {

	public static void main(String[] args) {
		
		Anonymous anonymous = new Anonymous();
		
		//익명 객체 : child
		anonymous.child.work();
		
		anonymous.methodA();
		
		anonymous.methodB(
				
				new Person() {
				void soccer() {
					System.out.println("축구를 합니다");
					}

				@Override
				void work() {
					System.out.println("훈련을 합니다");
					soccer();
				}
			}
		);
	}
}
