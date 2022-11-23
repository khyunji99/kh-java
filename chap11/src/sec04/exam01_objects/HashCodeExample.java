package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {		
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode());
		// Objects.hash(�Ű�����) �� �Ű������� ������ �ؽ��ڵ带 ����
		// Objects.hashCode(�Ű����� <-- ��ü�� �Ű������� ����)��
		// �Ű������� ������ �ִ� ��ü�� �ʵ带 ������
		// Objects.hash()�� �����ؼ� �ؽ��ڵ带 ����
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {             // ������ �ּҰ��� ������ ���������� ��������. ������ ���� �������ϸ鼭
			return Objects.hash(sno, name); // ( ) �ȿ��ִ� �Ű��������� �� ��, ���⼭�� sno�� name�� ������ �����ϴٰ� �����ϰ� �����.
		}
	}
}
