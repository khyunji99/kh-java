package sec05.exam05_instanceof;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);    // Vehicle Ÿ���� �Ű������� Bus ������ü�� ����. (�ڵ�����ȯ)
		driver.drive(taxi);   // Vehicle Ÿ���� �Ű������� Taxi �������װ� ����.
	}
}
