package Day02;

public class Ex02_Casting {
	public static void main(String[] args) {
		// 자동 타입 변환
		// (큰 데이터타입) = (작은 데이터타입);
		// : 작은 데이터타입을 큰 데이터 타입으로 자동 변환
		float value1 = 3;
		long value2 = 5;
		double value3 = 7;
		byte value4 = 9;		// (예외) byte의 범위 내의 값이므로 예외적 자동 변환
		short value5 = 11;		// (예외) short의 		"

		// 강제(명시적) 타입 변환
		// (작은 데이터타입) = (???)(큰 데이터타입);
		// : 큰 데이터 타입을 ???타입으로(작은 데이터 타입) 연산자 안에 명시적 작성하여 타입 강제 변환
		byte value6 = (byte) 128;
		int value7 = (int) 3.5;
		float value8 = (float)7.5;
			
		System.out.println("value1 "+value1);
		System.out.println("value2 "+value2);
		System.out.println("value3 "+value3);
		System.out.println("value4 "+value4);
		System.out.println("value5 "+value5);
		System.out.println("value6 "+value6);
		System.out.println("value7 "+value7);
		System.out.println("value8 "+value8);
	}
}
