package Day08.Ex01_shape;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		double width = 0.0;
		double height = 0.0;
		double R = 0.0;
		// 총합
		double roundSum = 0.0;
		double areaSum = 0.0;
		
		// 리스트 : 동적 자료구조, 컬렉션
		List<Shape> list = new LinkedList<Shape>();
		
		while(true) {
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.println(">>");
			
			String input = sc.next();
			if ( input.equals("그만")) break;
			
			int menuNo = Integer.parseInt(input); // 문자열 ---> 정수 변환
			// switch문에도 문자열이 가능하긴 하지만 문자열로 넣을 경우 case "1"이런식으로 표현해야함.
			
			switch (menuNo) {
			case 1:
				// 삼각형
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("높이>>");
					height = sc.nextDouble();
					shape = new Triangle(width, height);
					list.add(shape);
					break;

			case 2: 
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("세로>>");
					height = sc.nextDouble();
					shape = new Triangle(width, height);
					list.add(shape);
					break;
					
			case 3: 
					System.out.print("반지름>>");
					R = sc.nextDouble();
					shape = new Circle(R);
					list.add(shape);
					break;

			
			}
		}//while 끝
		
		for ( Shape s: list) {
			if ( s instanceof Triangle)
				System.out.print("[삼각형]");
			if ( s instanceof Rectangle)
				System.out.print("[사각형]");
			if ( s instanceof Circle)
				System.out.print("[원형]");
			
			double area = s.area();
			double round = s.round();
			
			roundSum = roundSum + round;
			areaSum = areaSum + area;
			
			System.out.println("넓이 : " + s.area() + " \t");
			System.out.println("둘레 : " + s.round() + " \t");
			System.out.println();
			
		}
		System.out.println("둘레 총합:" + roundSum);
		System.out.println("넓이 총합:" + areaSum);
		
		sc.close();
	}
}
