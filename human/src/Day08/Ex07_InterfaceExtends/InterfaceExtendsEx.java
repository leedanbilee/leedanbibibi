package Day08.Ex07_InterfaceExtends;

public class InterfaceExtendsEx {

	public static void main(String[] args) {
		
		//구현 객체 생성
		ImplementationC impl = new ImplementationC();
		
		InterfaceA iA = impl;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		System.out.println();
		
		//InterfaceC는 InterfaceA,InterfaceB를 상속받은 인터페이스
		// methodA(); , methodB(); , methodC(); 메소드 모두 호출 가능 
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		System.out.println();
	
	
	
	
	}
}
