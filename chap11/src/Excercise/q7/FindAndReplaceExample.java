package Excercise.q7;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		// indexOf() : ã����� ���ڿ� �������ִ� �޼���
		if(index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
			
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "Java");
			// replace(�Ű�����1, �Ű�����2)
			// �Ű�����1�� ���ڿ��� �Ű�����2�� ���ڿ��� ��ü�ϴ� �޼���
			System.out.println("-->" + str);
		}
	}
}
