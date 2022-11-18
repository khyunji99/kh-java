package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	// 생성자
	public Dog() {
		this.kind = "포유류";
	}
	
	// 추상메서드의 구현부를 구현한다. ( = 실행문을 재정의한다, 구현한다 = implementation)
	@Override
	public void sound() {
		System.out.println("멍멍뭉멍");
	}
	
	
	
}