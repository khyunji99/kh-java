package assignment;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("������ �Է� �ϼ���?"); // "2002"
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); // 2002

		// ctrl + shift + "f"
		// ������ ���� : year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "�� ����");
		} else {
			System.out.println(year + "�� ���");
		}
		
		
		
		// GregorianCalendar Ŭ������ ������ üũ�ϴ�
		// isLeapYear() �޼��带 ����Ͽ� ���� ���θ� �˻��غ���.
		// �����̸� true ��ȯ, ����̸� false ��ȯ
		System.out.println();
		System.out.println("------- GregorianCalendar�� ���� üũ --------");
		
		GregorianCalendar gc = new GregorianCalendar();
		
		if (gc.isLeapYear(year)) {
			System.out.println(year + "�� �����Դϴ�.");
		} else {
			System.out.println(year + "�� ����Դϴ�.");
		}
		
		
		
		
		
		
		
		
		

	}

}
