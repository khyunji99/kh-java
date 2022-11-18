package sec05.exam03_method_polymorphism;

// Vehicle 인터페이스를 구현하는 Taxi 구현클래스
public class Taxi implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("택시가 씽씽 달립니다.");
	}
}
