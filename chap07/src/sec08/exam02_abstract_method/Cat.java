package sec08.exam02_abstract_method;

// abstract 클래스를 상속받으려면 추상 클래스에 있는 추상메서드를 꼭
// 재정의 해줘야 한다. 안그러면 오류 발생.
// 여기서 추상 클래스는 Animal 클래스
public class Cat extends Animal {

	// 생성자
	public Cat() {
		this.kind = "포유류";    // kind 멤버변수는 상속받은 부모 클래스에
		                       // 있는 멤버변수이다.
	}
	
	@Override
	public void sound() {
		System.out.println("야오옹");
	}
	
	
}
