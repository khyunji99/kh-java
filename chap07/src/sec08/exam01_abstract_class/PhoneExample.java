package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone("ȫ�浿");
//	    -> abstract Ŭ������ ��ü ���� �Ұ�
		
		
//		�ڽ� Ŭ������ ������ ��ü�� ����� �Ǹ� ���� �θ� Ŭ������ �����ڰ� ȣ��ǰ�
//		�� �Ŀ� �ڽ� Ŭ������ �����ڰ� ȣ��Ǹ鼭 ��ü�� ���������.
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();         // ��ӹ��� �θ� Ŭ�������� ���ǵ� �޼���
		smartPhone.internetSearch(); // �ڽ� Ŭ�������� ���ǵ� �޼���
		smartPhone.turnOff();        // ��ӹ��� �θ� Ŭ�������� ���ǵ� �޼���
		
		
		
	}
}
