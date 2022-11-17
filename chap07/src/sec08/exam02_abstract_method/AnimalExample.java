package sec08.exam02_abstract_method;

public class AnimalExample {
	// 메서드
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		/* 지역변수의 자동 타입 변환 */
		// animal : 참조변수, 지역변수
		Animal animal = null;   // null 로 초기화 한다는 의미는
		                        // 빈 공간으로 만든다는 것
		
		animal = new Dog();     // 자동형변환, 부모 <- 자식
		animal.sound();         // animal 참조변수에는 Dog 객체가
		                        // 들어갔으니 그 Dog 객체의 sound 메서드가
		                        // 호출된다.
		
		animal = new Cat();     // 자동형변환
		animal.sound();         // 이번엔 animal 참조변수에 Cat 객체의
		                        // 참조값 , 주소값이 들어갔으니
		                        // Cat 객체의 주소값을 가지고 sound 메서드를
		                        // 호출하게 되니 야오옹이 출력된다.
		
		
		/* 매개변수의 자동 타입 변환 */
//		animalSound(); 안에는 Animal 클래스로 만든 객체가 들어가야 한다.
//		animalSound(new Animal());   하지만 이렇게 Animal 클래스를 가지고 객체를 바로 넣을 수 없다.
//		                             Animal 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없기 때문이다.
		animalSound(new Dog());  // 자동형변환, 부모 <- 자식
		                         // Dog 클래스는 상속받은 자식 클래스로 자식 클래스로 만든 객체는 부모 클래스로 자동으로 형변환된다.
		animalSound(new Cat());
		
		
		
	}
	
	
	// 메서드
	// 추상 클래스 타입의 매개변수를 받는 메서드
	// 추상 클래스에 있는 추상 메서드 sound 메서드를 호출하는 메서드
	public static void animalSound (Animal animal) {
		animal.sound();
	}
	
}
