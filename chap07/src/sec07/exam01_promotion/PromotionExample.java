package sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		// B 클래스의 부모 클래스 : A
		// C 클래스의 부모 클래스 : A
		// D 클래스의 부모 클래스 : B
		// E 클래스의 부모 클래스 : C
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();		
		
		A a1 = b;  // 자동형변환 : 부모 <- 자식
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;

    // B b3 = e;   // Type mismatch : 형변환은 상속관계에서만 가능하다.
		           // 그런데 B와 C 클래스는 서로 아무 관계가 아니다.
	// C c2 = d;
	}
}

