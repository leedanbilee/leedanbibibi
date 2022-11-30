package Day14.Ex02_Comparator;

import java.util.Comparator;

public class User implements Comparator<User> {

	// 변수

	String id;
	String name;
	int age; // int에는 compare 메소드를 쓸 수 없음.

	// 생성자

	public User() {
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// getter, setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// comparator 메소드

	@Override // 여러번 정렬을 할 떄.
	public int compare(User o1, User o2) { // 전달 된 o1,o2 두 객체를 비교, 순서를 int로 반환

		// 1차 정렬 : 나이순 - 오름차순
		// 2차 정렬 : 이름순 - 오름차순
		// o1을 기준으로 생각.
		// o1.age > o2.age ---> 양수 ---> o1이 더 뒤에 나온다.
		if (o1.age > o2.age) {
			return 1;
		}
		// o1.age < o2.age ---> 음수 ---> o1이 더 앞에 나온다.
		if (o1.age < o2.age) {
			return -1;
		}
		// o1.age = o2.age
		// if( o1.age == o2.age)
		if (o1.name.compareTo(o2.name) < 0) {
			return -1;
		}
		if (o1.name.compareTo(o2.name) > 0) {
			return 1;
		}
		//} -> 이 if문 생략 가능.
		return 0;
	}
}
		
		// o1.Name 가 o2.Name보다 더 앞 ---- 음수 >> 가나다 순
		// o1.Name 가 o2.Name와 같으면 ---- 0
		// o1.Name 가 o2.Name보다 더 뒤 ---- 양수 >> 가나다 역순



