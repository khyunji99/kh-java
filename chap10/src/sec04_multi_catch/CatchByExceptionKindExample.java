package sec04_multi_catch;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			// ���� �߻� ������ �ڵ�
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException ���� ó���� �� �ִ� ����� �ڵ�� �ۼ�
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java CatchByExceptionKindExample  num1  num2");
			
		} catch(NumberFormatException e) {
			// NumberFormatException ���� ó���� �� �ִ� ����� �ڵ�� �ۼ�
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
			
		} finally {
			// ������ �����ϴ� �ڵ�
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
