package Day08.Ex05_NoNameObject;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 익명 구현 객체
		// : 클래스를 정의하지 않고도, 하나의 클래스에서 이름없이 구현된 객체
		
//	Ex04의 RemotecontrolEx와 비교하면, 04에서는 television클래스를 만든 다음
//	Remotecontrol에 불러왔는데 05에서는 별도로 만드는거 없이 하나의 클래스에 나타냄.
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("ON");
			}
			
			@Override
			public void turnOff() {
				System.out.println("OFF");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 volume : " + volume);
				
			}
		}; // ;추가 --> 익명 구현 객체시 반드시.
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();
	}
}
