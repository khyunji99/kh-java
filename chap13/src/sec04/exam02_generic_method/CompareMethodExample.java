package sec04.exam02_generic_method;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		// new Pair< > �� < > �ȿ��� �����ؼ� ���� �� �ִ�.
		
		boolean result = Util.<Integer, String>compare(p1, p2);
		
		if(result) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
		
		Pair<String, String> p3 = new Pair<>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<>("user2", "ȫ�浿");
		
		boolean result2 = Util.compare(p3, p4);
		// ���׸� Ÿ�� <String, String> �����ؼ� ����ص� ���� ����.
		
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
	}
}
