package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a = new A();     // protected : ���� ��Ű���� ���� �����ϴ�.
		a.field = "value"; // 
		a.method();
	}
}
