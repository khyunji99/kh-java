package sec02.exam01_interface_declaration;

public interface RemoteControl {
	// ���
	static final int MAX_VOLUME = 10;
	
	// �̷��� (public) static final �����ص� ������.
	int MIN_VOLUME = 0;
	
	
	// �߻� �޼���
	// �������̽��� ������ ���� Ŭ������ ����� ���ؼ���
	// �߻�޼��带 �� ����(������) �ؾ��Ѵ�.
	abstract void turnOn();
	
	// �̷��� (public) abstract �����ص� ������.
	void turnOff();
	void setVolume(int volume);
	
	
	// ����Ʈ �޼���
	default void setNute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
	
	
}
