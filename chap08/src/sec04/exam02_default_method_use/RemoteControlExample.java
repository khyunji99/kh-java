package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television ������ü
		rc = new Television();
		rc.turnOn();        // �߻�޼��嵵 ���������̴�.
		rc.setMute(true);   // ������ü�� ���� ���������� ������ ��
		                    // ��������.����Ʈ�޼���()�� ����Ʈ�޼��忡 �����Ѵ�.
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
