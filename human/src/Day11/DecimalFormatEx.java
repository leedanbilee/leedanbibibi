package Day11;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		// DecimalFormat : 숫자 형식 클래스
		// : 숫자 데이터를 원하는 형식으로 표현하게 해주는 클래스
		// ex) 천 단위 구분 기호 : 1,000,000
		
		double num = 1234.5678;
		
		// 숫자 형식 패턴 기호
		// 0 			: 10진수를 표기, 빈자리를 0으로 채움
		// #			: 10진수를 표기, 빈자리를 채우지 않음
		// , 			: 단위 구분 (천, 만, 십만...)
		// .			: 소수점
		// %			: 100을 곱하고 % 표기
		// \u00A4		: \(원화표시)
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
	
		df = new DecimalFormat("00000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#####.#####");
		System.out.println(df.format(num));
	
		double num2 = 100000000;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num2));
		
		double num3 = 123;
		
		// +/-를 표시하고 싶을 때 >>> - 숫자는 별도표기 안해줘도 자동으로 표기가 됨.
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num3));
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num3));
		
		double num4 = 0.2;	// 20% 할인
		
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num4));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num2));
	
	
	}

}
