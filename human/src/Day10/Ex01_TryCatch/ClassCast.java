package Day10.Ex01_TryCatch;

class Animal{ }

class Dog extends Animal{ }

class Cat extends Animal { }

public class ClassCast {

	// Dog, Cat --> Animal
	// Animal = Cat 경우는 다시 Dog 변환 불가
	// - Cat을 Dog로 타입 변환 할 수 없다
	public static void changeDog(Animal animal) {
//		java.lang.ClassCastException
		Dog dog = (Dog) animal;
		
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);				// Cat이 인자로 전달된 경우, (Dog)로 변환 불가
	}
}
