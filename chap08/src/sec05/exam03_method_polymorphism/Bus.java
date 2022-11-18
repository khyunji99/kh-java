package sec05.exam03_method_polymorphism;

// Vehicle 인터페이스를 구현하는 Bus 구현클래스
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 부르릉 달립니다.");
	}
	
}
