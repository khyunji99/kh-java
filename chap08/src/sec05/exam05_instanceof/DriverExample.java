package sec05.exam05_instanceof;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);    // Vehicle 타입의 매개변수에 Bus 구현객체가 들어간다. (자동형변환)
		driver.drive(taxi);   // Vehicle 타입의 매개변수에 Taxi 구현객테가 들어간다.
	}
}
