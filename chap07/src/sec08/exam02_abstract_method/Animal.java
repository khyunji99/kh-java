package sec08.exam02_abstract_method;

public abstract class Animal {
	// 필드
	public String kind;
	
	// 생성자
	
	// 일반 메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드
	// 메서드의 이름 즉, 메서드의 선언부만 존재한다.
	// 메서드의 구현부 { } 는 존재하지 않는다.
	// 그 대신 ; 를 사용해서 메서드를 정의한다.
	// 추상 메서드는 자식 클래스에서 무조건 재정의 되어야 한다.
	public abstract void sound();
	
	
}

