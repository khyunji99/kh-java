package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	
	// �ʵ� (�������)
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("�ʵ�(�������)�� turnOn() ����");
		}

		@Override
		public void turnOff() {
			
		}

		@Override
		public void setVolume(int volume) {
			
		}
		
	};
	
	
	public static void main(String[] args) {
		// ���� �� ��Ű��(exam02_noname_implement_class) ����
		// ���� Ŭ������ �������� �ʴ´�.
		
		// �̷��� ���� Ŭ������ ���µ� ��ü�� ������ �Ѵٸ� �͸� ���� ��ü�� ����°� ����.
		// �͸� ���� ��ü�� ����
		// �������̽��� + ���� = new + �������̽���() { };
		// ���ٽ� : �͸�����ü�� �ܷ���(�����ϰ�) ǥ���ϴ� �� (���߿� �� ����)
		// �͸�����ü�� ����Ŭ������ �������� �ʰ� ��ü�� ���� �� �ִ�.
		// �ѹ��� ��ü�� ������ �����̶�� �͸�����ü�� ���� ����ϴ°�
		// �Ϲݱ�����ü�� ����ϴ� �ͺ��� ȿ�����̴�.
		
		// �͸� ���� ��ü ����
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Television�� turnOn() ����");
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		
		rc.turnOn();
		
		// �ٸ� �͸�����ü�� rc ������ ����
		// ��ü ��ȯ���� �̿��� ���̴�.
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio�� turnOn() ����");
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		rc.turnOn();
	}
}
