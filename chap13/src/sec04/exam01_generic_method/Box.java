package sec04.exam01_generic_method;

// ���ʸ� Ÿ�� : Ÿ���� �Ķ���ͷ� ���� Ŭ���� �Ǵ� �������̽�
public class Box<T> {
	private T t;
	
	public T get() { 
		return t; 
	}
	
	public void set(T t) {
		this.t = t;
	}
}
