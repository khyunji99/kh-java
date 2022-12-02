package sec02.exam01_none_generic_type;


public class BoxExample {
	public static void main(String[] args) {
		/** 제네릭 타입을 사용하지 않은 경우 **/
		Box box = new Box();
		box.set("홍길동"); // Object = String  <-- 자동형변환
		String name = (String)box.get();   // String = (String)Object  <-- 강제형변환
		
		box.set(new Apple()); // Object = Apple  <-- 자동형변환
		Apple apple = (Apple)box.get(); // Apple = (Apple)Object  <-- 강제형변환		
		
	}

}
