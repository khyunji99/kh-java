package sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";  // "100" �� ���� ������ ����
		String data2 = "a100";
		
		// Integer.parseInt()
		// ( ) �ȿ� String ������ �����µ� �� StringŸ����
        // ������ 10���� ���������� �о� ��ȯ�ϴ� �Լ�
		int value1 = Integer.parseInt(data1);
		
		// NumberFormatException �߻�
		// Integer.parseInt("���ڿ�"): ���ڿ� -> ���� => �����߻�
		// "����" �̷��� ������ String�� ������ ( ) �ȿ� ���;�
		// ���������� ���� �� �ִµ� "���ڿ�" �̷��� ���·� ( ) �ȿ� ���͹�����
		// ���� �� ��� NumberFormatException �� �߻� 
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}

