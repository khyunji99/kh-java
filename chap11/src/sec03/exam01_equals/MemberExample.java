package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
		// �������� equals �޼��带 ȣ���ϴ� ���̶��
		// obj1�� �����ϰ� �ִ� ��
		// ��, obj1�� ������ �ִ� �ּҰ��� ����Ű�� �ִ� ��ü�� ������ �ִ� ����
		// obj2�� �����ϰ� �ִ� ��
		// ��, obj2�� ������ �ִ� �ּҰ��� ����Ű�� �ִ� ��ü�� ������ �ִ� ����
		// �� ������ ����� �ȴ�. obj1�� ������ �ִ� �ּҰ��� ����Ű�� 
		// ��ü�� ������ �ִ� ���� blue�̰� 
		// obj2�� ������ �ִ� �ּҰ��� ����Ű�� ��ü�� ������ �ִ� ����
		// blue�̹Ƿ� �������� equals�޼��尡 ȣ��Ǿ� ����Ǹ�
		// �����ϴٰ� ��µȴ�.
		// ���� �����ǵ� equals �޼��尡 �ƴ� �׳� Object Ŭ�������� �ִ�
		// equals�޼���� ȣ���ؼ� �����Ѵٸ� �������� �ʴٰ� ��µȴ�.
		// ��? obj1�� obj2�� ������ �ִ� �ּҰ��� �ٸ��� �����̴�.
		// Object obj2 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}
}
