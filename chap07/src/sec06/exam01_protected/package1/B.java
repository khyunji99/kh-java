package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a = new A();     // protected : 같은 패키지는 접근 가능하다.
		a.field = "value"; // 
		a.method();
	}
}
