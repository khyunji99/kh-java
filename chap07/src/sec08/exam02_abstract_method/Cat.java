package sec08.exam02_abstract_method;

// abstract Ŭ������ ��ӹ������� �߻� Ŭ������ �ִ� �߻�޼��带 ��
// ������ ����� �Ѵ�. �ȱ׷��� ���� �߻�.
// ���⼭ �߻� Ŭ������ Animal Ŭ����
public class Cat extends Animal {

	// ������
	public Cat() {
		this.kind = "������";    // kind ��������� ��ӹ��� �θ� Ŭ������
		                       // �ִ� ��������̴�.
	}
	
	@Override
	public void sound() {
		System.out.println("�߿���");
	}
	
	
}
