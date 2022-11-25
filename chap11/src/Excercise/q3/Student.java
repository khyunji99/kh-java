package Excercise.q3;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj; // ��������ȯ
			if(this.studentNum == student.studentNum) {
				// this.studentNum.equals(student.studentNum) ���� ��� ��
				// == �� ���ص� �Ǵ� ������ ���� ���� ������ �ִ� String�� ��ü��
				// �ּҰ��� �����ϱ� ������ �ּҰ� ���ϴ� == �� ���ص� ������.
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
		// �ڱ� ��ü�� ����ִ� �ʵ� studentNum�� �ؽ��ڵ带 �����ϵ���
		// Object Ŭ������ �ִ� hashCode() �޼��� ������
	}
	
}
