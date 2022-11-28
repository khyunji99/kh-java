package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
//		Integer obj = new Integer(10);  // boxing
		// Auto Boxing
		Integer obj = 10;  // Auto Boxing : ������ <- �⺻��
		
		// ���Խ� Auto Unboxing
		int value = obj;   // Auto Unboxing : �⺻�� <- ������
		System.out.println("value = " + value);
		
		// ����� Auto Unboxing
		int result = 100 + obj;
		// ���� ������ ���� ������ ������ �ȴ�. �׷��� ���� 100�� int��
		// obj�� �������ε� �ڵ������� �������� �⺻���� �ȴ�.
		// �̰� ����� Auto Unboxing�̶�� �Ѵ�.
		System.out.println("result = " + result);
	}
}

