package Day06.Ex01_student;

public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 기본 생성자 ---> StudentEx로 값 전달해줄꺼임.
	public Student() {
		
	}
	// 매개변수 생성자 : 매개변수가 있는 생성자를 만들어 줄 경우 기본 생성자를 반드시 만들어 줄 것.
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}


	// 학생의 행동
	// 메소드
	// void : 반환타입을 지정하지 않을 떄 사용하는 키워드
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	
	// 반환타입이 void면, return을 작성하지 않는다.

	}


	// 점수의 평균을 반환하는 메소드
	public double getScore(int score1, int score2) {
		double average = 0.0;
		// 평균 = 합계 / 개수
		average = (double)(score1 + score2) / 2 ;
		return average;
	}
	public double getScore(int score1, int score2, int score3) {
		double average = 0.0;
		// 평균 = 합계 / 개수  ---> 평균은 소수점, 점수는 정수타입 -> 그러므로 강제 변환
		// (큰타입) + (작은타입) => (큰 타입)
		// (double) / (int) => double
		average = (double)(score1 + score2 + score3) / 3 ;
		return average;
	}

	// 메소드 오버로딩 (N개의 과목의 평균)
	public double getScore(int[] scores) {
		double average = 0.0;
		int sum = 0;
		for (int score : scores) {
			// 최종합계 = 이전합계 + 과목점수
			sum += score;

		}
		average = (double)sum / scores.length;
		return average;
	}
	
	
	
}
