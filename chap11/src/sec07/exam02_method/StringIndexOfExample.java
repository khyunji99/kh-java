package sec07.exam02_method;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		
		int location = subject.indexOf("���α׷���");
		// ���α׷��� �̶�� ���ڿ��� ������
		// �� ���ڿ��� �����ϴ� �ε��� ���� ����
		System.out.println(location);
		// 3 ����
		// "���α׷���" ���ڿ��� ������
		// '��'�� �ִ� �ε����� ��ȣ�� ���ϵȰ�
		
		if (subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱��� !");
		} else {
			System.out.println("�ڹٿ� ������ ���� å�̱���..");
		}
		
	}
}

