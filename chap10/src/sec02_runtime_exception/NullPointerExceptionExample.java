package sec02_runtime_exception;

// ��ü�� ���� ���¿��� ��ü�� ����� �� �߻��ϴ� ����
public class NullPointerExceptionExample {
	public static void main(String[] args) {
//		String data;  // �̰͵� ����ִ� ���� �ǹ�
		String data = null;
		
		// toString() �޼���
		// data �� �����ϰ� �ִ� ��ü ���� �״�� ��ȯ�Ǿ� ��µǴ� ��
		// �׷��� data�� ������ �ִ� ���� �ƹ��͵� ����. (�����ϰ� �ִ� ���� ����)
		// ���� ���� �߻�!
		System.out.println(data.toString());  // NullPointerException ���ܹ߻�
		
		// �� �Ʒ��� ��¹��� ���� �߻� ���Ŀ� �ִ� �ڵ��̹Ƿ� ���� x
		System.out.println("���� �߻� ���Ŀ� �ִ� �ڵ� ��� x");
	}
}

