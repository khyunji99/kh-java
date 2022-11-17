package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	// 생성자
	public Dog() {
		this.kind = "포유류";
	}
	
	// 추상메서드를 구현한다. ( = 재정의한다 = implementation)
	@Override
	public void sound() {
		System.out.println("멍멍뭉멍");
	}
	
	
	
}