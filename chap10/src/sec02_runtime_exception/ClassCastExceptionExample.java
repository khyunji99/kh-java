package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);  // Animal 타입의 매개변수에 Dog 타입의 인자값 dog 대입
		
		Cat cat = new Cat();
		// 아래의 changeDog(cat);  <-- ClassCastException 발생
		// changeDog 메서드는 Animal형 타입의 매개변수를 받는 메서드이다.
		// 그 받은 매개변수를 Dog형으로 다운캐스팅 해주는 기능을 가지고 있는데
		// 다운 캐스팅을 하려면 그 전에 Dog형이 Animal형으로 업캐스팅이 되었었어야
		// Dog형으로 다운캐스팅 할 수가 있다.
		// 하지만 cat변수는 Cat형으로 만들어진 변수이므로 다운캐스팅의 조건에
		// 부합하지 않는데 강제로 다운캐스팅 하려고 하니 예외 발생한다.
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog)  // if문 넣어주게 되면 ClassCastException 예외 발생 가능성 없어짐
		//{
			Dog dog = (Dog) animal;   // ClassCastException 발생 가능성 있음
		//} 
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

