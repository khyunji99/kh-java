package sec05.exam03_method_polymorphism;

public class Driver {
	
	// Vehicle 인터페이스 타입의 매개변수를 받는 메서드
	// 메서드의 매개변수에 인터페이스 타입의 매개변수를 두었다.
	// 인터페이스에 넣을 수 있는 것 : 인터페이스를 구현하고 있는 클래스로 만든 구현객체
	// 다음과 같이 할 수 있다.
	// Vehicle 인터페이스 = new Bus();
	// Vehicle 인터페이스 = new Taxi();
	
	// Vehicle vehicle = new Bus();   (o)
	// Vehicle vehicle = new Taxi();  (o)
	
	// 이 drive 메서드의 매개변수에는 Bus 구현클래스로 만든 구현객체와
	// Taxi 구현클래스로 만든 구현객체 둘다 들어올 수 있다.
	// 왜냐하면 Bus, Taxi 클래스는 모두 다 Vehicle 인터페이스를 구현하고 있는
	// 구현 클래스이므로 가능하다.
	// 상속관계에서 부모타입의 변수에 자식객체를 넣는것과 비슷..?
	
	void dirve(Vehicle vehicle) {
		vehicle.run();
	}
}
