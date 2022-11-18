package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		// 인터페이스 = 구현객체  <-- 자동형변환
		Vehicle vehicle = new Bus();

		// 이 vehicle 참조변수로는 Vehicle 인터페이스에 있는
		// 멤버에만 접근하고 참조할 수 있다.
		// 따라서 Bus클래스에 있는 checkFare() 함수는 참조할 수 없다.
		// (참조영역 축소)
		// vehicle.checkFare(); (x)
		vehicle.run();
		
		// 강제타입변환
		// 구현클래스명 + 변수 = (구현클래스명) + 인터페이스 참조변수;
		// vehicle은 전에 Bus 구현클래스로 만든 구현객체가 들어있는
		// 참조변수이므로 다시 Bus 구현 클래스로 강제타입변환 할 수 있다.
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();   // 참조영역 확대
		
		/*
		Taxi taxi = (Taxi) vehicle;  // 얘는 강제타입변환 x
		                             // vehicle은 Bus 구현클래스타입이
		                             // 인터페이스로 형변환 된 것이라서
		                             // Taxi로 강제형변환 할 수 없다.
		
		taxi.run();
		taxi.checkFare();
		*/
	}
}
