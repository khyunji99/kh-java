package sec05.exam03_method_polymorphism;

public class Driver {
	
	// Vehicle �������̽� Ÿ���� �Ű������� �޴� �޼���
	// �޼����� �Ű������� �������̽� Ÿ���� �Ű������� �ξ���.
	// �������̽��� ���� �� �ִ� �� : �������̽��� �����ϰ� �ִ� Ŭ������ ���� ������ü
	// ������ ���� �� �� �ִ�.
	// Vehicle �������̽� = new Bus();
	// Vehicle �������̽� = new Taxi();
	
	// Vehicle vehicle = new Bus();   (o)
	// Vehicle vehicle = new Taxi();  (o)
	
	// �� drive �޼����� �Ű��������� Bus ����Ŭ������ ���� ������ü��
	// Taxi ����Ŭ������ ���� ������ü �Ѵ� ���� �� �ִ�.
	// �ֳ��ϸ� Bus, Taxi Ŭ������ ��� �� Vehicle �������̽��� �����ϰ� �ִ�
	// ���� Ŭ�����̹Ƿ� �����ϴ�.
	// ��Ӱ��迡�� �θ�Ÿ���� ������ �ڽİ�ü�� �ִ°Ͱ� ���..?
	
	void dirve(Vehicle vehicle) {
		vehicle.run();
	}
}
