package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Google", "Android");
		
		// SmartPhone Ŭ������ ��ӹ޴� �θ� Ŭ������
		// Object Ŭ�������� ������ toString �޼ҵ�
		// toString �޼��尡 ��ȯ���ִ� ���� 
		// ������ SmartPhone Ŭ�������� toString �޼��带 ���������ָ�
		// ���� ���ϴ� �ǹ��ִ� ���� ����� �� �ִ�.
		// toString �޼��� ������ �� ��°�
		// : sec03.exam03_tostring.SmartPhone@1c4af82c
		// toString �޼��� ������ �� ��°�
		// : Google , Android
		String strObj = myPhone.toString(); 
		System.out.println(strObj);
		
		System.out.println(myPhone);
		System.out.println(myPhone.toString());
		
		
	}
}
