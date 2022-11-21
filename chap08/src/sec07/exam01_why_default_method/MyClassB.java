package sec07.exam01_why_default_method;

// 구현 클래스
public class MyClassB implements MyInterface {

	
	@Override
	public void method1() {
		System.out.println("MyClassB-재정의된 추상메서드-method1() 실행");
	}

	
	@Override
	public void method2() {
		System.out.println("MyClassB-재정의된 디폴트메서드-method2() 실행");
	}
	
	
}
