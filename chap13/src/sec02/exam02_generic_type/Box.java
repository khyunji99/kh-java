package sec02.exam02_generic_type;

// ���׸� Ÿ�� : class<T> �Ǵ� interface<T>
public class Box<T> { // <-- Box��� ���׸� Ÿ���̴�.
	private T t;
	
	public T get() { 
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
