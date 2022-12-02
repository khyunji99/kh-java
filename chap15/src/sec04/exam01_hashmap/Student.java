package sec04.exam01_hashmap;

// ����� ���� Ŭ����
public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
		//��) 1 + 33(value���� name�� ������ ���� �ؽ��ڵ尪) = 34
	}
	// value���� name�� ������ �ؽ��ڵ� ����� �ؼ� sno���� ���Ѵ�.
	// �̶� sno���� value���� name�� ������ hashCode�� ���� �ǹǷ�
	// �Ѵ� ���� ���� ���� ���̴�. �׷��� ���������� ������ hashCode() �޼��� �������Ѱ�

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	
	
	
	
}

