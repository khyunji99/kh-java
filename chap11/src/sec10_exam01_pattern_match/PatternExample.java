package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";  // ���Խ�
		//(02|010) --> 02 �Ǵ� 010 �� �;����� �ǹ�
		// \d --> Ư����ȣ, �Ѱ��� ���ڰ� �;��ϴ� �ǹ�
		// \t --> Ư����ȣ, �� Ű�� �ǹ���
		// \\d --> Ư����ȣ �տ� \�� �ϳ� �� ���� ������ �ڿ� ������ \d��
		//         Ư����ȣ�� ���� ���� �ƴ϶� �׳� \���ڿ��� ���� ��� �����ִ� ��
		// -\\d {3,4} - --> - - ���̿� ���ڰ� 3���������� 4�������� �´�
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		// ��ȿ�� ���� : �ʿ��� Ư�� ������ ���˿� �´��� �����ϴ� ��
		// ex) �̸��� ����, ��ȭ��ȣ ����, ��й�ȣ ���� ���� �´��� ����
		// boolean result = Pattern.matches("���Խ�", "�Էµ� ���ڿ�");
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// \w --> �Ѱ��� ���ĺ� �Ǵ� �Ѱ��� ���ڰ� �;����� �ǹ�
		// \\w+ ���ĺ��� �Ѱ� �Ǵ� �Ѱ� �̻��� �;��Ѵ�.
		// (\\.\\w+)? --> ( ) �ȿ� �ִ� �ֵ��� �Ѱ� �ְų� ����� ���� �ǹ�
		data = "angel@navercom"; // naver.com ó�� . �� ��� ���Խİ� ��ġ���� �ʴ´�.
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
	}
}
