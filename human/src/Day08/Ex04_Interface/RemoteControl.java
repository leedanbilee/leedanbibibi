package Day08.Ex04_Interface;

public interface RemoteControl {

	// static final이 붙은 변수는 굵은 기울임체로 표시됨.(outline에서 SF확인 가능)
	// 인터페이스 변수는 public static final로 자동으로 선언된다.
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	// : (public abstract)를 생략하고 작성할 수 있다.
	void turnOn();					// 전원 ON
	void turnOff();					// 전원 OFF
	void setVolume(int Volume);		// 볼륨 설정
	
	// 디폴트 메소드
	// : 구현 객체에 할당될 인스턴스 메소드
// 예시: 만약 해당 인터페이스로 500개 이상의 클래스가 연결되어잇는ep
//	mute기능을 추가하고싶다.
//	그러면 추상 메소드에 추가할 경우 500개를 다 찾아서 오버라이드 해야하기 때문에
//	인터페이스에 디폴트메소드를 통해 구현을 할 수 있도록 한다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정");
		} else {
			System.out.println("음소거 해제");
		}
		
	}
	
	// static 메소드(정적 메소드)
	// : 구현 객체가 없어도 인터페이스 만으로 호출이 가능한 메소드(원래 인터페이스만으로는 호출이 되지않음)
	static void changeBettery() {
		System.out.println("배터리를 교환");
	}



}
