package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("Hello");
		String str1 = box1.get(); // 강제형변환 안해도 바로 String타입에 대입이 가능하다. --> 제네릭의 이점
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);            // Integer = int <-- 박싱(boxing)
		int value = box2.get(); // int = Integer <-- 언박싱(unboxing)
		
		
	}
}
// Box 객체에 여러가지 타입의 매개변수들이 들어갈 수 있다.
// 그러고 나서 따로 형변환하지 않아도 바로 들어왔던 타입의 변수에 대입이 된다.
// --> 제네릭의 이점