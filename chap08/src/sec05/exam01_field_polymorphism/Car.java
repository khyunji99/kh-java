package sec05.exam01_field_polymorphism;

public class Car {
	// �ʵ�
	// Car Ŭ������ �ʵ忡�� Tire �������̽��� ����ϰ� �ʹ�.
	
	// �������̽��� + ���� = new + ����Ŭ������( );
	// �������̽� = HankookTire ������ü <-- �ڵ�����ȯ
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	
	
	// �޼���
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
