package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// SmartTelevision ����Ŭ���� ������ ������ü ����
		// �͸� ������ü �ƴ�!!
		SmartTelevision tv = new SmartTelevision();
		
		// �������̽� = ������ü
		// �������̽��� ������ ������ü ���� (�ڵ�����ȯ)
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
