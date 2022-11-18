package sec05.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) { // 실행메서드
		
		Car myCar = new Car();
		myCar.run();     // Car 클래스에는 HankookTire 구현객체만 생성되어 있다.
		
		
		// frontLeftTire의 타입은 Tire 인터페이스형이다.
		// 즉, fontLeftTire는 Tire 인터페이스형이고
		// KumhoTire는 Tire 인터페이스를 구현하는 구현객체이다.
		
		// Tire 인터페이스 = KumhoTire 구현객체  <-- 자동형변환
		// 이게 가능한 이유는 frontLeftTire, .. 들이
		// Tire 인터페이스 타입으로 선언되고 만들어져서
		// 이렇게 다른 구현클래스 즉 다른 구현객체를 넣을 수 있는 것이다.
		// 만일 Car 클래스에서 Hankook frontLeftTire = new Hankook();
		// 로 만들었다면 아래와 같이 frontLeftTire 에 KumhoTire 구현객체를
		// 넣어서 변경할 수 없다.
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		
		
	}
}
