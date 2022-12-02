package sec03.exam03_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));  // 7 ���
		
		fi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return sum(x, y);
			}
		};
		// �̷��� �� ���� �Ʒ�ó�� ���ٷ� �ƾ��� �����ϰ� ���� �� �ִ�.
			
		
		fi = (x, y) -> sum(x, y);
		// ���� �� �����ϰ� ���� �ڵ�
		System.out.println(fi.method(3, 5)); // 8 ���
		
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}











