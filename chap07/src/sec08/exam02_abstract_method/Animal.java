package sec08.exam02_abstract_method;

public abstract class Animal {
	// �ʵ�
	public String kind;
	
	// ������
	
	// �Ϲ� �޼���
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻� �޼���
	// �޼����� �̸� ��, �޼����� ����θ� �����Ѵ�.
	// �޼����� ������ { } �� �������� �ʴ´�.
	// �� ��� ; �� ����ؼ� �޼��带 �����Ѵ�.
	// �߻� �޼���� �ڽ� Ŭ�������� ������ ������ �Ǿ�� �Ѵ�.
	public abstract void sound();
	
	
}

