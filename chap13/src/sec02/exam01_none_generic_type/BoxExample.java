package sec02.exam01_none_generic_type;


public class BoxExample {
	public static void main(String[] args) {
		/** ���׸� Ÿ���� ������� ���� ��� **/
		Box box = new Box();
		box.set("ȫ�浿"); // Object = String  <-- �ڵ�����ȯ
		String name = (String)box.get();   // String = (String)Object  <-- ��������ȯ
		
		box.set(new Apple()); // Object = Apple  <-- �ڵ�����ȯ
		Apple apple = (Apple)box.get(); // Apple = (Apple)Object  <-- ��������ȯ		
		
	}

}
