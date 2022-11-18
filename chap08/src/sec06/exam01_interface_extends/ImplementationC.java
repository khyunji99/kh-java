package sec06.exam01_interface_extends;

// 인터페이스 C는 인터페이스 A, B 를 둘다 상속받고 있다.
// 따라서 인터페이스 C를 구현하기 위해서는 인터페이스 A,B,C에 있는
// 모든 추상메서드들을 재구현해줘야 구현클래스가 될 수 있다.
public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}	
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}

