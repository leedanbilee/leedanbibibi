package Day03;

public class Ex06_OddEven {

	public static void main(String[] args) {
		// 1~20까지의 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		//1+3+5+7+9+11+13+...+19 =
		// 2+4+6+8+10+12+...+20 =
		// while, if 문을 사용.
		
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		
		while ( a <= 20 ) {
			if ( a % 2 == 1) {
				sum1 += a;
			}
			// else { sum += a;만으로 써도 됨
			if ( a % 2 == 0) {
				sum2 += a;
			}
			a++;
		}
		
		System.out.println("홀수의 합계: " + sum1);
		System.out.println("짝수의 합계: " + sum2);
	}
}
