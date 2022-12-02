package sec03.exam02_arguments;

public class MyMethodReferencesExample { 
	public static void main(String[] args) {
		// �������̽��̸� + ��������;
		MyFunctionalInterface fi;
		
		// �������̽� = �͸��� ��ü
		fi = new MyFunctionalInterface() {
			@Override
			public void method(int x, int y) {
				int result = x * y;
				System.out.println(result);
			}
		};
		fi.method(5, 5); // 25 = 5*5 ���
		
		// ���ٽ�
		fi = (x, y) -> {
			int result = x * y;
			System.out.println(result);
		};
		fi.method(5, 5);
		
		
		/* �Ű������� x �ϳ��϶�
		 fi = x -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		 */
	}
}











