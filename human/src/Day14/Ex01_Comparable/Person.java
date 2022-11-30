package Day14.Ex01_Comparable;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//getter,setter
	
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
	
	@Override
	public int compareTo(Person o) { // Comparable<Person>에 대한 것.
		//Person은 비교객체
		
		// 해당객체.나이 - 비교객체.나이
		// 22 - 44 = -22(음수)----> 오름차순. 해당객체의 나이인 22를 더 앞에 정렬
//	>>>>>>>>>>>  오름차순으로 정렬을 원할경우 값이 음수가 나오도록.
		// 비교객체 - 해당객체
		// 44 - 22 = 양수     ----> 내림차순.해당객체를 더 뒤에 정렬 
		
		int gap = this.getAge()-o.getAge();
		return gap;
	}
	
	
}
