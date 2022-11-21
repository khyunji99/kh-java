package sec07.exam01_why_default_method;

// 구현 클래스
public class MyClassA implements MyInterface {
	// 필드
	
	// 생성자
	MyClassA(){}
	
	// 메서드
	@Override
	public void method1() {
		System.out.println("MyClassA-재정의된 추상메서드-method1() 실행");
	}
	
	
}
