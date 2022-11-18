package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;   // 강제형변환
			bus.checkFare();
		}
		vehicle.run();
	}
}
