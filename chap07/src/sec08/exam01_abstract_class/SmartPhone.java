package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	// �ʵ�
	// ������
	public SmartPhone(String owner) {
	//  super();      <- ���� �θ� Ŭ�������� �⺻ �����ڰ� ���� ���� 
		super(owner);
	}
	// (�Ϲ�) �޼���
	public void internetSearch() {
		System.out.println("���ͳ��� �˻� �մϴ�.");
	}
	
	
}
