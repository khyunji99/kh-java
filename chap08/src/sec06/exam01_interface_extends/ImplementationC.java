package sec06.exam01_interface_extends;

// �������̽� C�� �������̽� A, B �� �Ѵ� ��ӹް� �ִ�.
// ���� �������̽� C�� �����ϱ� ���ؼ��� �������̽� A,B,C�� �ִ�
// ��� �߻�޼������ �籸������� ����Ŭ������ �� �� �ִ�.
public class ImplementationC implements InterfaceC {
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");
	}	
	
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
	}
	
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
	}
}
