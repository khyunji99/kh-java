package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	// �ʵ�
	int channel;
	
	// ������
	DmbCellPhone(String model, String color, int channel){
//		super();                 // �θ��� �⺻�����ڸ� ȣ���Ͽ� �θ�ü ������
		                         // ��ӹ����� super(); �� �����Ϸ��� �ڵ����� �����ش�
		                         // �ٸ�, ���� ������ ������
		this.model = model;      // �θ� �ʵ� ��ӹ޾� ��
		this.color = color;      // ���
		this.channel = channel;  // �ڽ� ����
	}
	
	// �޼���
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ��Ĩ�ϴ�.");
	}
	
	
	
}

