package sec07.exam01_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		// B Ŭ������ �θ� Ŭ���� : A
		// C Ŭ������ �θ� Ŭ���� : A
		// D Ŭ������ �θ� Ŭ���� : B
		// E Ŭ������ �θ� Ŭ���� : C
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();		
		
		A a1 = b;  // �ڵ�����ȯ : �θ� <- �ڽ�
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;

    // B b3 = e;   // Type mismatch : ����ȯ�� ��Ӱ��迡���� �����ϴ�.
		           // �׷��� B�� C Ŭ������ ���� �ƹ� ���谡 �ƴϴ�.
	// C c2 = d;
	}
}

