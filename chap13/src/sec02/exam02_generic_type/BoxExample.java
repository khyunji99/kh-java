package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("Hello");
		String str1 = box1.get(); // ��������ȯ ���ص� �ٷ� StringŸ�Կ� ������ �����ϴ�. --> ���׸��� ����
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);            // Integer = int <-- �ڽ�(boxing)
		int value = box2.get(); // int = Integer <-- ��ڽ�(unboxing)
		
		
	}
}
// Box ��ü�� �������� Ÿ���� �Ű��������� �� �� �ִ�.
// �׷��� ���� ���� ����ȯ���� �ʾƵ� �ٷ� ���Դ� Ÿ���� ������ ������ �ȴ�.
// --> ���׸��� ����