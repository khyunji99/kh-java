package sec03.exam01_parent_constructor_call;

public class StudentExample {
	// �ʵ�
	// ������
	// �޼���
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		System.out.println("�̸� : " + student.name);
		System.out.println("�ֹι�ȣ : " + student.ssn);
		System.out.println("�й� : " + student.studentNo);
	}
}

