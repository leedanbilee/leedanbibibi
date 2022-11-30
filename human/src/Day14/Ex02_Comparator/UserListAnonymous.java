package Day14.Ex02_Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class UserListAnonymous {

	public static void main(String[] args) {
		
		List<User> userList = new LinkedList<>();
		
		User u1 = new User("asd1001","김휴먼", 10);
		User u2 = new User("gesd1001","이휴먼", 20);
		User u3 = new User("erd1001","박휴먼", 30);
		User u4 = new User("wefd1001","장휴먼", 20);
		User u5 = new User("tvsde1001","유휴먼", 30);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		
		// 익명 객체로 comparator 인터페이스
		// 1번 만 정렬을 필요로 할 때는 익명객체를 사용해 해당 클래스 내에서 해도 됨.
		Collections.sort(userList, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {

				int gap = o1.id.compareTo(o2.id);
				return gap;
			}
		});
		
		for (User user : userList) {
			System.out.println("id : " + user.id);
		}
	}
}
