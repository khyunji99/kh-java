package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A { // D Ŭ������ A Ŭ������ ��� �ް� �ִ�.
	public D() {
		super();
		this.field = "value";  // protected�� ��� ������ ���, �ٸ� ��Ű������ ���� �����ϴ�.
		this.method(); 
	}
}
