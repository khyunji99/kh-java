package sec07.exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		
		String[] strs = new String[100]; 
		// String ���� ������ �迭 (���ڿ� �迭) ����
		// �迭�� ũ��� 100���� ����
		System.out.println("�迭�� ���� = " + strs.length);
		// 100 ���
		
		String ssn = "7306241230123";
		// ���ڿ�
		int length = ssn.length();
		// length() : ���ڿ� ����
		/** ���鵵 ���ڿ� �����̴� **/
		System.out.println("���ڿ��� ���� = " + ssn.length());
		// 13 ���
	}
}

