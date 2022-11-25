package Day08.Ex01_shape;

public class Circle extends Shape {

	double R;
	// PI는 JAVA 시스템 안에 저장된 표준값을 쓴다(나중에 패키지구조 참고). - > Math.PI
	
	public Circle() {
		super();
	}


	public Circle(double r) {
		super();
		R = r;
	}


	@Override
	double area() { 
		return Math.PI * R * R;
	}

	@Override
	double round() {
		return 2 * Math.PI * R ;
	}


	@Override
	public String toString() {
		return "Circle [R=" + R + "]";
	}


}
