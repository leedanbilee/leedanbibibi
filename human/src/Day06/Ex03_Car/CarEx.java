package Day06.Ex03_Car;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.model = "제네시스"; // -> car에서 가져온 메소드 model에 제네시스를 입력할꺼야.
//		car.speed = 100 ;  
//		Car 클래스에서 private로 걸어놔서 speed에 직접 접근 불가.
//		메소드를 통해서 우회적으로 값을 가져온다.(메소드 오버라이딩)
		car.setSpeed(100);
		
		System.out.println("speed :" + car.getSpeed());
	}
}
