package Day04;

public class Ex02_Arrays {

	public static void main(String[] args) {
		
		//[][][]
		//[][][]

		// 정방 배열
		int arr[][] = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		//	aArrayIndexOutOfBound
		// : 범위가 넘어선 배열 인덱스에 접근할 때, 발생하는 예외
		//	arr[2][0] = 10; --> arr int [2][3] 까지가 범위
	
		// arr.length		: 첫번째 차원의 배열 요소의 개수
		// arr[i].length	: 두번째 차원의 배열 요소의 개수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
	
	
	}
}
