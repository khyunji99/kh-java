package sec05.exam01_field_polymorphism;

public class Car {
	// 필드
	// Car 클래스의 필드에서 Tire 인터페이스를 사용하고 싶다.
	
	// 인터페이스명 + 변수 = new + 구현클래스명( );
	// 인터페이스 = HankookTire 구현객체 <-- 자동형변환
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	
	
	// 메서드
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
