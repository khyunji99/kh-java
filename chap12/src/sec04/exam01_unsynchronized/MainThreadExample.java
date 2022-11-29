package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // �۾� ������ ����
		user1.setCalculator(calculator);
		user1.start();
		// user1 Ŭ������ �ִ� run() �޼��� �����
		// 100�� ��� �Ǿ�� �ϴµ� 50�� ��µ�
		// Why? user2�� ���� calculator ��ü�� ����ϰ� �ֱ� ������
		// user1�� ���� ����ϰ� ������ user2�� ����ϰ� �Ǵµ�
		// �̶� ���� ��ü�� ����ϰ� �ֱ⶧���� user2�� ���� �����Ҷ�
		// user1�� �� �ٲ� ������ ���Ѵ�.
		// ���� ��������� calculator ��ü���� 50�̶�� ������ �ٲ�� �Ǿ�����
		// user1�� 50�̶�� ������ ��µȴ�..

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		// user2 Ŭ������ �ִ� run() �޼��� �����
	}
}
