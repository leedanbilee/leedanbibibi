package Day11;

import java.text.MessageFormat;

public class MessageEx {

	public static void main(String[] args) {
		// 문자열 형식을 만들고
		// 문자열에 데이터가 들어갈 자리를 {k}로 표시한다. (k: 0~)
		// \n : 한 줄 개행(엔터)
		// \t : 탭
		String text = "아이디 : {0} \n비밀번호 : {1}";
		String id = "human1004";
		String pw = "12346";
		String login = MessageFormat.format(text, id, pw);

		System.out.println(login);

		String[] studentInfo = {"김휴먼", "22학번", "컴퓨터공학과", "20살"};
		String studentFormat = "이름 : {0} \n" 
							 + "학번 : {1} \n"
							 + "전공 : {2} \n"
							 + "나이 : {3} \n";
		
		String student = MessageFormat.format(studentFormat, studentInfo);
		
		System.out.println(student);
		
		
		
	}
}
