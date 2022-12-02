package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// Util�� �ִ� boxing �޼���� ���� static �޼����̴�.
		Box<Integer> box1 = Util.<Integer>boxing(100); 
		// <T> ����Ÿ��, boxing(T t)
		// t = 100 -> T = integer
		// 
		// <T> Box<T> boxing(T t)�޼����� ����Ÿ���� 
		
		int intValue = box1.get(); // unboxing, int = Integer;
		
		//Box<String> box2= Util.<String>boxing("ȫ�浿");
		//boxing �տ� �ִ� <String>�� �����ؼ� ����� �� �ִ�.
		Box<String> box2= Util.boxing("ȫ�浿");
		String strValue = box2.get();
	}
}
