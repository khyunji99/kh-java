package sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		// �������̽� = ������ü  <-- �ڵ�����ȯ
		Vehicle vehicle = new Bus();

		// �� vehicle ���������δ� Vehicle �������̽��� �ִ�
		// ������� �����ϰ� ������ �� �ִ�.
		// ���� BusŬ������ �ִ� checkFare() �Լ��� ������ �� ����.
		// (�������� ���)
		// vehicle.checkFare(); (x)
		vehicle.run();
		
		// ����Ÿ�Ժ�ȯ
		// ����Ŭ������ + ���� = (����Ŭ������) + �������̽� ��������;
		// vehicle�� ���� Bus ����Ŭ������ ���� ������ü�� ����ִ�
		// ���������̹Ƿ� �ٽ� Bus ���� Ŭ������ ����Ÿ�Ժ�ȯ �� �� �ִ�.
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();   // �������� Ȯ��
		
		/*
		Taxi taxi = (Taxi) vehicle;  // ��� ����Ÿ�Ժ�ȯ x
		                             // vehicle�� Bus ����Ŭ����Ÿ����
		                             // �������̽��� ����ȯ �� ���̶�
		                             // Taxi�� ��������ȯ �� �� ����.
		
		taxi.run();
		taxi.checkFare();
		*/
	}
}
