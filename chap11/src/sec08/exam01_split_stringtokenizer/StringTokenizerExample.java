package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";

		StringTokenizer st = new StringTokenizer(text, "/");
		
		int countTokens = st.countTokens();
		
		// ��� 1
		// ��ü ��ū ���� �� �Ϲ����� for������ ���
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// ��� 2
		// �����ִ� ��ū�� Ȯ���ϰ� while������ ���
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {  // ��ū�� ���������� while�� ����
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
// StringTokenizer Ŭ����
//