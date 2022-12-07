package sec05.exam07_printstream;

import java.util.Date;

public class PrintfExample {
	public static void main(String[] args) {
		// PrintStream : OutputStream�� ������Ʈ��
		System.out.printf("��ǰ�� ����:%d��\n", 123); // ��ǰ�� ����:123��
		System.out.printf("��ǰ�� ����:%6d��\n", 123);// ��ǰ�� ����:   123��
		System.out.printf("��ǰ�� ����:%-6d��\n", 123);// ��ǰ�� ����:123   ��
		System.out.printf("��ǰ�� ����:%06d��\n", 123);// ��ǰ�� ����:000123��
		
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, Math.PI*10*10);
		// �������� 10�� ���� ����:    314.16
		
		System.out.printf("%6d | %-10s | %10s\n", 1, "ȫ�浿", "����");
		//      1 | ȫ�浿        |         ����
		
		Date now = new Date();
		System.out.printf("������ %tY�� %tm�� %td�� �Դϴ�\n", now, now, now);
		// ������ 2022�� 12�� 07�� �Դϴ�
		System.out.printf("������ %1$tY�� %1$tm�� %1$td�� �Դϴ�\n", now);
		// ������ 2022�� 12�� 07�� �Դϴ�
		System.out.printf("���� %1$tH�� %1$tM�� %1$tS�� �Դϴ�\n", now);
		// ���� 17�� 35�� 43�� �Դϴ�
	}
}

