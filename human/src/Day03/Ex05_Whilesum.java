package Day03;

public class Ex05_Whilesum {

	public static void main(String[] args) {
		
		//1~100까지의 합계를 구하시오.
		// 1+2+3+4+5+6+.....+100 = 5050
		// ? + 1의 값을 알수 없기 떄문에 int sum = 0 을 정의해주지 않으면 오류가 뜸
		int sum = 0;
		int a = 1;
		
		while(a <= 100 ) {
			//복합대입연산자
			sum += a++;
			// sum =sum + a;
			// a++;
			// 두 줄을 합친것이 sum += a++;
			
			
		}
			System.out.println("합계 : " + sum);
	}

	
}
