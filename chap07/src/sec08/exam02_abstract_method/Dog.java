package sec08.exam02_abstract_method;

public class Dog extends Animal {
	
	// ������
	public Dog() {
		this.kind = "������";
	}
	
	// �߻�޼����� �����θ� �����Ѵ�. ( = ���๮�� �������Ѵ�, �����Ѵ� = implementation)
	@Override
	public void sound() {
		System.out.println("�۸۹���");
	}
	
	
	
}