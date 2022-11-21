package sec07.exam01_why_default_method;

public class DefaultMethodExample {
	public static void main(String[] args) {
		// mi1 : 참조형 지역변수
		MyInterface mi1 = new MyClassA();  // 자동형변환 (인터페이스 = 구현객체)
		mi1.method1();  // MyClassA 구현 클래스에 있는 재정의된 method1() 추상메서드
		
		mi1 = new MyClassB();
		mi1.method1();  // MyClassB 구현 클래스에 있는 재정의된 method1() 추상메서드
		mi1.method2();  // MyClassB 구현 클래스에 있는 재정의된 method2() 디폴트메서드
	}
}
