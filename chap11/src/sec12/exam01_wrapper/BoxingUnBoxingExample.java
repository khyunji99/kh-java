package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing : �⺻��(stack�޸�) -> ������(heap�޸�) �� ����
		Integer obj1 = new Integer(100);  // boxing: ������ <- �⺻��
		// int�� ��ü�� Integer ��ü�� ��ȯ..?
		// int���� boxing�ϴ� ���� IntegerŬ������ ���ش�
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("350");
		// String ���� Integer ��ü�� ��ȯ..?
		
		// Unboxing
		int value1 = obj1.intValue();  // unboxing: �⺻�� <- ������
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
	}
}