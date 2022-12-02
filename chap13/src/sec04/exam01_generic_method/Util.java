package sec04.exam01_generic_method;

// Util 일반 클래스
public class Util {
	// 제너릭 메서드
	// boxing : 메서드 이름, T : 매개변수 t 의 타입
	// Box<T> : 메서드의 리턴타입, <T> :  제너릭 타입
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box; // Box<T> 객체 box
	}
}
