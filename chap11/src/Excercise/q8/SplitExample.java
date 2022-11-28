package Excercise.q8;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		
		System.out.println("--- split() �޼��� ����ؼ� ��� ---");
		//1. split() �޼��� ���
		String[] str1 = str.split(",");
		for (String words : str1) {
			System.out.println(words);
		}
		
		//2. StringTokenizer ���
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int countTokens = st.countTokens();
		
		System.out.println("--- StringTokenizer&��ū ���� ����ؼ� ��� ---");
		//(1) ��ü ��ū ���� �� �Ϲ����� for������ ���
		for ( int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println("--- StringTokenizer&���� ��ū ����ؼ� ��� ---");
		//(2) �����ִ� ��ū�� Ȯ���ϰ� while������ ���
		st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
