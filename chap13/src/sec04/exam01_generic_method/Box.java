package sec04.exam01_generic_method;

// 제너릭 타입 : 타입을 파라미터로 갖는 클래스 또는 인터페이스
public class Box<T> {
	private T t;
	
	public T get() { 
		return t; 
	}
	
	public void set(T t) {
		this.t = t;
	}
}
