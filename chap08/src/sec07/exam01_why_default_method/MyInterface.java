package sec07.exam01_why_default_method;

public interface MyInterface {
	// ���
	// abstract �޼���
	public void method1();
//	public void method2();  // MyClassB���� ����ϰ� ���� �޼��带 �߻�޼���� �߰�
	                        // �߻�޼���� ���ο� �޼��带 �߰��ϰ� �Ǹ�
	                        // �� �޼��带 ������� �ʴ� ���� Ŭ����������
	                        // �����Ǹ� ������Ѵ�.
	// default �޼���
	public default void method2() {
	System.out.println("MyInterface-method2 ����");
	}
	
	
	// static �޼���
}
