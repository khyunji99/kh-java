package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {
			// ���� �߻� ������ �ڵ�
			// Class.forName("���ڿ�")
			// ( )�ȿ� ������ ���ڿ��� �ش��ϴ� Ŭ���� ��ü�� ã�� ��ȯ���ִ� �Լ�
			Class clazz = Class.forName("java.lang.String2"); // java.lang.String Ŭ������ ������ java.lang.String2 ��� Ŭ������ �������� �ʾƼ� ���ܰ� �� ���̴�. �׷��� catch ���� ����ȴ�.
			
		} catch(ClassNotFoundException e) { // Exception �� ���� Ŭ���� �� ���� ���� Ŭ�����̴�. ���� ClassNotFoundException��� Exception�� �����ָ� ���� �� ����� �� �ִ�.
			// ���� ó���ϴ� �ڵ�
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			
		}
		
		
	}
}

