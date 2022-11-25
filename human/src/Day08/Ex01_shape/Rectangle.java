package Day08.Ex01_shape;

public class Rectangle extends Shape{

	double width, height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// 사각형 넓이 : 가로 * 세로
		return width * height;
	}

	@Override
	double round() {
		// 둘레 : (가로 + 세로) * 2 
		return (width + height) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	

}
