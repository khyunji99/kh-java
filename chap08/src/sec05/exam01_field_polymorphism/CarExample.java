package sec05.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) { // ����޼���
		
		Car myCar = new Car();
		myCar.run();     // Car Ŭ�������� HankookTire ������ü�� �����Ǿ� �ִ�.
		
		
		// frontLeftTire�� Ÿ���� Tire �������̽����̴�.
		// ��, fontLeftTire�� Tire �������̽����̰�
		// KumhoTire�� Tire �������̽��� �����ϴ� ������ü�̴�.
		
		// Tire �������̽� = KumhoTire ������ü  <-- �ڵ�����ȯ
		// �̰� ������ ������ frontLeftTire, .. ����
		// Tire �������̽� Ÿ������ ����ǰ� ���������
		// �̷��� �ٸ� ����Ŭ���� �� �ٸ� ������ü�� ���� �� �ִ� ���̴�.
		// ���� Car Ŭ�������� Hankook frontLeftTire = new Hankook();
		// �� ������ٸ� �Ʒ��� ���� frontLeftTire �� KumhoTire ������ü��
		// �־ ������ �� ����.
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		
		
	}
}
