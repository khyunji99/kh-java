package sec04.exam01_generic_method;

// Util �Ϲ� Ŭ����
public class Util {
	// ���ʸ� �޼���
	// boxing : �޼��� �̸�, T : �Ű����� t �� Ÿ��
	// Box<T> : �޼����� ����Ÿ��, <T> :  ���ʸ� Ÿ��
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box; // Box<T> ��ü box
	}
}
