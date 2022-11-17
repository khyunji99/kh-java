package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A { // D 클래스는 A 클래스를 상속 받고 있다.
	public D() {
		super();
		this.field = "value";  // protected는 상속 관계인 경우, 다른 패키지여도 접근 가능하다.
		this.method(); 
	}
}
