package sec07.exam02_method;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA PROGRAMING";
		
		System.out.println(str1.equals(str2));
		// ��ҹ��ڸ� �ٸ��� �ν��ϱ� ������ false ��µ�
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		// str1 �� str2 ���ڿ����� ��� �ҹ��ڷ� ������ ����
		// ���ο� ��ü lowerStr1�� lowerStr2�� ���� �־����.
		// lowerStr1�� lowerStr2�� �Ȱ��� "java programing"
		// �̶�� ���ڿ��� �����ϰ� �����Ƿ� equals �޼����
		// ������ �� true �� ��µȴ�.
		
	}
}

