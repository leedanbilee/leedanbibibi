package Day14.Ex01_Comparable;

public class Student implements Comparable<Student> {

	String name;
	int age;
	int grade;
	
	// 생성자
	public Student() {
	}
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	// getter, setter
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override  // compare to 조건
	public int compareTo(Student o) {
		// 이름순 
		int gap = this.getName().compareTo(o.getName());
		// 해당 객체 더 앞 순서 : 음수
		// 순서가 같다 : 0
		// 해당 객체 더 뒷 순서 : 양수
		return gap;
	}
	
	
	
	
}
