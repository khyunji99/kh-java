package sec03.exam01_name_implement_class;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		// rc �� ������������ ��������
		// rc�� �������̽�Ÿ���̴�.
		// RemoteControl�� �������̽� �̱� �����̴�.
		RemoteControl rc;
		
		// RemoteControl �������̽��� ������ Television ������ü ����
		// �������̽��� ���� = ������ü(Television����Ŭ������) --> �ڵ�����ȯ
		rc = new Television(); // ��ü ��ȯ..?
		
		rc.turnOn();  // Television ����Ŭ������ �ִ� turnOn() �޼��尡 ȣ��ȴ�.
		
		
		// RemoteControl �������̽��� ������ Audio ������ü ����
		// rc�� RemoteControl �������̽��� Ÿ���� �����ε� ���⿡
		// Audio ����Ŭ������ Ÿ���� ���� ���̹Ƿ� ���� �ٸ���.
		// �׷��� Audio ����Ŭ������ �������̽��� ������, ��ӹ��� Ŭ�����̹Ƿ�
		// �ڵ����� ����ȯ�� �ȴ�.
		// �굵 �ڵ�����ȯ�̴�.
		rc = new Audio();
		
		
	}
}
