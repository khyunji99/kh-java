package sec02.exam01_inheritance;

// ����� Ŭ���� : ���� ������ Ŭ����
public class DmbCellPhoneExample {
	// �ʵ�
	// ������
	
	// �޼���
	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		// ��������, ��������(local variable) : {} ��ȣ �ȿ��� �����ǰ� {} �� ������ �������. 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�����", "������", 11);
		
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// �θ�(CellPhone)���κ��� ��� ���� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������. ��������?");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���? ���� ��������� �մϴ�.");
		dmbCellPhone.sendVoice("��, �ȳ��ϼ���. ");
		dmbCellPhone.hangUp();
		
		// �ڽ�(DmbCellPhone) �޼��� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();
		
	}

}
