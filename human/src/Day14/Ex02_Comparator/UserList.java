package Day14.Ex02_Comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class UserList {
 
	public static void main(String[] args) {
		
		LinkedList<User> userList = new LinkedList<>();
		
		User u1 = new User("abc1004", "김휴먼", 20);
		User u2 = new User("ced1004", "홍휴먼", 10);
		User u3 = new User("sef1004", "박휴먼", 30);
		User u4 = new User("gef1004", "장휴먼", 50);
		User u5 = new User("gef1004", "정휴먼", 20);
		User u6 = new User("gef1004", "강휴먼", 50);
		User u7 = new User("gef1004", "고휴먼", 30);
		User u8 = new User("gef1004", "도휴먼", 50);
		User u9 = new User("gef1004", "나휴먼", 10);
		User u10 = new User("yef1004", "전휴먼", 20);

		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);
		// Colletions.sort(리스트, comparator를 구현한 객체());
		//- 오버라이딩한 compare 메소드의 기준에 따라서 정렬된다.
		Collections.sort(userList, new User());
		
		for (User user : userList) {
			System.out.print("id : " + user.id);
			System.out.print(", name : " + user.name);
			System.out.println(", age : " + user.age);
		}
	}
}
