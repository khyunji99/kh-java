package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		
		// �������̽��̸� + ��������;
		MyFunctionalInterface fi;
		
		// �������̽� = �͸� ���� ��ü
		// fi �������� �͸� ���� ��ü�� �Ҵ�Ǿ� �ִ�.
		fi = new MyFunctionalInterface() {
			@Override
			public void method() {
				String str = "method call1";
				System.out.println(str);
			}
		};
		fi.method();  // "method call1" ���
		
		
		// �������̽� = ���ٽ�
		// ���ٽ��� �͸� ���� ��ü�� �����ϰ� ���� ���� �ǹ��Ѵ�.
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		// ���ٽ� �� �����ϰ�
		fi = () -> {
			System.out.println("method call1");
		};
		fi.method();
		
		// ������ �����ϰ�
		fi = () -> System.out.println("method call1");
		fi.method();
		
	}
}











