package sec07.exam02_method;

public class StringValueOfExample {
	public static void main(String[] args) {
		int num = 10;
		String str1 = String.valueOf(num); // ����ȯ : ������(String) <- �⺻��(int)
		// num���� ���� 10�� ���ڿ� "10"�� ��ȯ�ؼ� str1�� �־��ش�.
		// �ڼ��� �������ڸ� int�� num ������ 10�̶�� ���� �־�����.
		// �� num ������ ����ִ� �� 10�� ������
		// String ��ü�� ����� �� 10�� �ִ´�.
		// 10�̶�� ���� int������ String������ ��ȯ�Ȱ�
		// �� String ��ü�� �ּҰ��� str1 ���������� �־����� �ȴ�.
		
		System.out.println(str1); // "10" ���
		
		String str2 = String.valueOf(10.5);
		// double�� 10.5�� String�� "10.5"�� ��ȯ��
		String str3 = String.valueOf(true);
		// boolean�� true�� String�� "true"�� ��ȯ��
		
		System.out.println(str2); // "10.5" ���
		System.out.println(str3); // "true" ���
		
		
	}
}

// valueOf( ) : ���ڿ� ��ȯ
// �⺻�� Ÿ�Ե��� ���ڿ��� ��ȯ���ִ� �޼���
// ����ȯ�� �Ѵ� : ������ <- �⺻��
