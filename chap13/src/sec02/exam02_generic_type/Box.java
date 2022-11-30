package sec02.exam02_generic_type;

// 제네릭 타입 : class<T> 또는 interface<T>
public class Box<T> { // <-- Box라는 제네릭 타입이다.
	private T t;
	
	public T get() { 
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
