package sec07.exam01_why_default_method;

public interface MyInterface {
	// 상수
	// abstract 메서드
	public void method1();
//	public void method2();  // MyClassB에서 사용하고 싶은 메서드를 추상메서드로 추가
	                        // 추상메서드로 새로운 메서드를 추가하게 되면
	                        // 이 메서드를 사용하지 않는 구현 클래스에까지
	                        // 재정의를 해줘야한다.
	// default 메서드
	public default void method2() {
	System.out.println("MyInterface-method2 실행");
	}
	
	
	// static 메서드
}
