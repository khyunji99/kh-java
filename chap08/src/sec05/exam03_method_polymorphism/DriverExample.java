package sec05.exam03_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		// Driver ��ü ����
		Driver driver = new Driver();
		
		// Bus, Taxi ������ü ����
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// �Ű������� ������
		// �޼����� �Ű������� �������̽� Ÿ������ ����
		// �������� ������ü�� ���� �� �ְ�
		// �Ű������� ���� ������ü�� ���� ȣ��Ǵ� �޼��嵵 �޶���
		// ��µǴ� ���� �޶�����.
		driver.dirve(bus);  // Vehicle vehicle = new Bus(); <-- �ڵ�����ȯ
		driver.dirve(taxi);
		
    }
}

//    �߻�Ŭ����     VS  �������̽�
// "�Ű������� ����"  VS  "������"