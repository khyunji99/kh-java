package sec07.exam01_why_default_method;

public class DefaultMethodExample {
	public static void main(String[] args) {
		// mi1 : ������ ��������
		MyInterface mi1 = new MyClassA();  // �ڵ�����ȯ (�������̽� = ������ü)
		mi1.method1();  // MyClassA ���� Ŭ������ �ִ� �����ǵ� method1() �߻�޼���
		
		mi1 = new MyClassB();
		mi1.method1();  // MyClassB ���� Ŭ������ �ִ� �����ǵ� method1() �߻�޼���
		mi1.method2();  // MyClassB ���� Ŭ������ �ִ� �����ǵ� method2() ����Ʈ�޼���
	}
}
