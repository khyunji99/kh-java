package sec04.exam03_static_method_use;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// ���� �޼ҵ� (���� ��ü�� ������ �ʾƵ� �ٷ� ������ �� �� �ִ�.)
	// �߻� �޼��峪 ����Ʈ �޼���� ������ü�� ������ ������ �� �ִ�.
	// ��������.�߻�޼��� or ��������.����Ʈ�޼��� �̷��� ���
	// ����Ʈ�޼��峪 �߻�޼��忡 �����Ѵ�.
	// ������ ���� �޼���� �̷��� ������ü�� ������ �ʰ� �������̽�������
	// ���� �޼��忡 �����Ͽ� ����� �� �ִ�.
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
