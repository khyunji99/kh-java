package sec02_runtime_exception;

  // �迭���� �ε��� ���� �ʰ��Ͽ� ����� �� �߻��ϴ� ����
  // �ΰ��� ���� �Ű����� ���� �ʾұ� ������ args[0], args[1] �ε����� ����� �� ����.
  // �ذ��� : ArrayIndexOutOfBoundsException�� �߻��ϴ� Ŭ��������
  //          ��Ŭ�� �� Run as �� > Run Configuration ��
  //        > Arguments �� > Program Arguments �� ���� ������ �� ����
  //        ���� ��� �ε��� 0���� a3��, 1�� �ε����� a4�� �־��ְ� �ʹٸ�
  //        a3 a4�� �����ָ� args[0], args[1] �迭�� ���� ����Ƿ�
  //        ���������� ���� �ȴ�.
    public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];  // ArrayIndexOutOfBoundsException �߻�
		
		System.out.println("args[0]: " + data1); 
		System.out.println("args[1]: " + data2);
	}
}

/* public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);  // ArrayIndexOutOfBoundsException �߻�
			System.out.println("args[1]: " + data2);
			
		}
		else {
			System.out.println("[���� ���]");
			System.out.println("java className �Ű�����1 �Ű�����2");
		}
	}
}
*/
