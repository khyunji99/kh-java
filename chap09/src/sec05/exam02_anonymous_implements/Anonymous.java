package sec05.exam02_anonymous_implements;

public class Anonymous {
	// 1) �ʵ� �ʱⰪ���� �͸�����ü�� ����
	RemoteControl field = new RemoteControl() {
		// �������̽� RemoteControl �� �ִ� �߻� �޼��� ��� ������
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1() {
		// 2) ���ú��������� �͸�����ü�� ����
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};
		//���ú��� ���
		localVar.turnOn();
	}
	
	// �޼����� �Ű������� RemoteControl �������̽��� ���� ����
	// �׷��� �� �Ű������� ���� �͸� ���� ��ü�� ���� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}











