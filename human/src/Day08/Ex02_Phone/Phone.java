package Day08.Ex02_Phone;

public abstract class Phone {

	// 변수
	public String owner;
	
	// 생성자

	public Phone(String Owner) {
		this.owner = owner;
	}
	// 메소드
	public void turnOn() {
		System.out.println("전원 켭니다...");
	}
	public void turnOff() {
		System.out.println("전원 끕니다...");
	}
	
}
