package sec05.exam01_field_polymorphism;

// Tire �������̽��� �����޴� HankookTire ����Ŭ����
public class HankookTire implements Tire {
	
	// Tire �������̽��� �ִ� �߻�޼��� �籸��(������)�� �޼���
	@Override
	public void roll() {
		System.out.println("�ѱ� Ÿ�̾ �������ϴ�.");
	}
}
