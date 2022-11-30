package Day14.Ex01_Comparable;
import java.util.Collections;
import java.util.LinkedList;

public class PersonList {

//	return값 : 음수 >>>>> 해당 객체가 비교 객체보다 작으면 -------> 해당 객체를 더 앞에 정렬
//	0 >>>>> 해당 객체가 비교 객체랑 같으면 -------> 같은 순서로 정렬	
//	양수 >>>>> 해당 객체가 비교 객체보다 크면 -------> 해당 객체를 더 뒤에 정렬
	public static void main(String[] args) {
		Person p1 = new Person("김휴먼",23);
		Person p2 = new Person("정에듀",68);
		Person p3 = new Person("박리사",15);
		Person p4 = new Person("이재석",45);
		Person p5 = new Person("윤호석",50);
		
		LinkedList<Person> personList = new LinkedList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		Collections.sort(personList); // comparable에 정해져있는 메소드
		
		for (Person person : personList) {
			System.out.println(person.name + " : "+ person.age);
		}
	}
}
