package sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567";
		
		// substring(int beginIndex, int endIndex);
		// (beginIndex) ������ �ε�������
		// (endIndex) ������ �ε��� ������ ������ ���ڿ��� ����
		String firstNum = ssn.substring(0, 6);
		// 0��° �ε������� 5��° �ε����� �ִ� ���ڵ� ���
		System.out.println(firstNum); // 880815 ���
		
		
		// substring(int beginIndex);
		// (beginIndex) �־��� �ε������� ���ڿ� ������
		// ���ڿ� ����
		String secondNum = ssn.substring(7); // 7 �ε��� ���ĺ��� ���ڿ� ������ ���ڵ� ���
		System.out.println(secondNum); // 1234567 ���
		
		
	} 
}

