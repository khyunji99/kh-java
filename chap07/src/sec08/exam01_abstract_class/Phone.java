package sec08.exam01_abstract_class;

public abstract class Phone {
	// �߻�Ŭ������ �������
	// �ʵ�
	public String owner;
	
	// ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �Ϲ� �޼���
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
	// �߻� �޼���
	
	
}
