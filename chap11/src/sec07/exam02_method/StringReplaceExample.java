package sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		// "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�." ���
		System.out.println(newStr);
		// "JAVA�� ��ü������ �Դϴ�. JAVA�� ǳ���� API�� �����մϴ�."
		// oldStr���� ���ڿ��� �ٲ�� ���� �ƴ϶�
		// oldStr ��ü�� �״�� �ְ� ���ο� newStr�̶�� ��ü�� ����
		// ���ο� newStr ��ü���� ���ڿ��� �ٲٴ� ���̴�.
		// �׷��� oldStr�� ������� �� �״�� �ٲ�� ���� ���ڿ���
		// ��µǴ� ���̴�.
		
		
	}
}

