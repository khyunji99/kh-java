package sec03.exam03_multi_implement_class;

// SmartTelevision Ŭ������ RemoteControl �������̽��� Searchable �������̽���
// �����ϱ� ���ؼ��� ������ �������̽��ȿ� �ִ� �߻�޼��带 �ݵ�� �籸��(������)�ؾ��Ѵ�.

// ������ ���� �������̽��� ������ �����޾Ƽ� ����Ŭ���� ���� �� �ִ�.
public class SmartTelevision implements RemoteControl, Searchable {
	
	private int volume;
	
	// RemoteControl �������̽��� �ִ� �߻�޼��� �籸��
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("���� TV ����: " + volume);
	}
	
	
	// Searchable �������̽��� �ִ� �߻�޼��� �籸��
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
