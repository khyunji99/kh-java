package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// �ʵ�
	public int studentNo;  // �й�
	
	// ������
	public Student (String name, String ssn, int studentNo) {
		// ���� Ŭ������ People Ŭ�������� �Ű������� �޴� �����ڹۿ� ����.
		// ���� ���� Ŭ������ Student Ŭ�������� �����ڸ� ���鶧
		// ���� Ŭ������ �����ڸ� ������ ȣ���ؾ��ϴµ� ���� Ŭ������ People
		// Ŭ�������� �Ű������� �޴� �����ڹۿ� ����.
		// ���� ���� Ŭ���������� �Ű������� �޴� �����ڸ� ȣ������� �Ѵ�.
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
}
