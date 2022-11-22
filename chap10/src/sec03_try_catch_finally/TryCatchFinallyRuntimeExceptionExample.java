package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("---- try-catch�� ----");
		
		String data1 = null;
		String data2 = null;
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ� �Է�
			data1 = args[0]; // args[] �迭���� ���� ���� ������ ���� �߻�
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			// ���ܸ� ó������ �� �ִ� �ڵ� �Է�
			// java ClassName Ŭ������ num1�� num2�� ���� �������
			// ���ܸ� ó���� �� �ִ� ��� �˷��ֱ�
			System.out.println("[������]");
			System.out.println("java ClassName num1 num2");
			
			return;  // return; : main() �޼��带 ��ħ���ν� ���α׷� �����Ű�� ���� �ǹ�
		}
		// data1�� data2�� �� �־��ָ� ����ȴ�.
		// �� �־��ִ� ��� : �� Ŭ������ ���콺 �����ٰ� ��Ŭ��
		// -> Run as Ŭ�� -> Run Configuration Ŭ��
		// -> Arguments �� Ŭ�� -> Program argument�� �� �����ֱ�
		// -> Run ������
		// �� �ȳ־��ָ� ���� �ȵǰ� �տ� �ִ� try-catch�� �����
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		
		
		System.out.println("---- try-catch-finally�� ----");
		
		
		try {
			// ���� �߻� ������ �ڵ�
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			// ������ ���ܰ� �߻����� ������ ������ �ڵ尡 �����
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		}catch(NumberFormatException e) {
			// ���� ó�� �ڵ�
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
			
		}finally {
			// ������ �����ϴ� �ڵ�
			System.out.println("�ٽ� �����ϼ���.");
		}
		
	}
}

