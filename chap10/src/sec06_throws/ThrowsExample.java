package sec06_throws;

/** ���� ���ѱ�� **/
public class ThrowsExample {
	// main() �޼���
	public static void main(String[] args) {
		
		try {
			findClass();  // ���ܰ� �߻��� �� �ִ� �޼���
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}
	
	// throws Ű���� : ���� ���ѱ涧 ���
	// findClass( ) �޼���
	// static �޼���� �������� ������ ���� main �޼��忡�� �� findClass �޼���
	// ������ �� ���� ��뵵 �� �� ����.
	public static void findClass() throws ClassNotFoundException {
		// ���ܰ� �߻��� �� �ִ� �ڵ�
		Class clazz = Class.forName("java.lang.String2");  
	}
}

