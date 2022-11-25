package Day06.Ex03_Car;

public class Car {
//----> 값을 안정해줄꺼면 변수로 언급해주고 생성자 만들어주기.
//	필드 == 멤버변수
	String model;
	private int speed ;
	// private		: 해당 클래스 내에서만 접근 가능
	
//	생성자
	Car(){ // 기본생성자
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
//	private speed이기 때문에 CarEx에서 사용이 불가해서 아래와 같이 해줌 
//	-----> 그냥 public으로 하면 프로그램 생성 시 다른 사람이 오류값을 입력했을때 그것을 막을 방법이 없음.
//	getter : 변수의 값을 가져오는 메소드
//	setter : 변수의 값을 지정하는 메소드
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
