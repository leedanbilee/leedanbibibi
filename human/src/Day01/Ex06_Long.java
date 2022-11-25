package Day01;

public class Ex06_Long {

	public static void main(String[] args) {
		
		long ln1 = 1000;
		long ln2 = 2100000000;  //여기까지는 int 타입 (int는 21억xxx까지 가능)
		long ln3 = 2200000000L;  // 22억부터는 int로 표현되지 않기때문에 long타입으로 표현할 수 있는 L 붙여주기
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int maxOverflow = max + 1;
		int minOverflow = min - 1;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println(maxOverflow);
		System.out.println(minOverflow);
		
		System.out.println(ln1);
		System.out.println(ln2);
		System.out.println(ln3);
		
		
		
	}

}
