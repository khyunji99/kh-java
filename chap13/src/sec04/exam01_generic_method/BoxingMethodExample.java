package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		// Util에 있는 boxing 메서드는 정적 static 메서드이다.
		Box<Integer> box1 = Util.<Integer>boxing(100); 
		// <T> 리턴타입, boxing(T t)
		// t = 100 -> T = integer
		// 
		// <T> Box<T> boxing(T t)메서드의 리턴타입은 
		
		int intValue = box1.get(); // unboxing, int = Integer;
		
		//Box<String> box2= Util.<String>boxing("홍길동");
		//boxing 앞에 있는 <String>을 생략해서 사용할 수 있다.
		Box<String> box2= Util.boxing("홍길동");
		String strValue = box2.get();
	}
}
