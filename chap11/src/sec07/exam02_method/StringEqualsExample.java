package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = new String("�Ź�ö");
		String str2 = "�Ź�ö";
		String str3 = "�Ź�ö";

		if(str1 == str2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if (str2 == str3) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		//* String ��ü�� ����񱳴� String�� ��ü.equals( ) ����ؾ��Ѵ�.
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
		
		if (str2.equals(str3)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		
		
		
	}
}