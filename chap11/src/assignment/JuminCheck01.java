package assignment;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {

	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�
	public boolean juminCheck (String jumin) { // 111111-1111011
		System.out.println("jumin = " + jumin);
		// ��ȿ�� �˻� �ڵ带 �Ʒ��� �Է��ϼ���.
		// ��·�� true �� �����ؾ��Ѵ�.
		int num = jumin.charAt(0) * 2 + jumin.charAt(1) * 3
				+ jumin.charAt(2) * 4 + jumin.charAt(3) * 5
				+ jumin.charAt(4) * 6 + jumin.charAt(5) * 7
				+ jumin.charAt(6) * 8 + jumin.charAt(7) * 9
				+ jumin.charAt(8) * 2 + jumin.charAt(9) * 3
				+ jumin.charAt(10) * 4 + jumin.charAt(11) * 5;
		
		int num2 = num % 11;
		int result = 0;
		String last = jumin.substring(11, 12);
		
//		System.out.println("num2 = " + num2);
		
		/** ó�� 11�� ���� ���� 10�̻��϶� **/
		if (num2 >= 10) {
			result = num2 % 10;
//			System.out.println("result = " + result);
//		System.out.println("last="+last);
			//Integer.parseInt(jumin.substring(11, 12));
			if ( result == Integer.parseInt(last) ) {
				return true;
			} else {
				return false;
			}
		}
		else {
			if ( num2 == Integer.parseInt(last)) {
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {

		JuminCheck01 jc = new JuminCheck01();
		InputStream is = System.in; // ctrl + shift + "o" : �ڵ����� �ʿ��Ѱ� import ���ִ� ����Ű
		Scanner sc = new Scanner(is); // Ű���忡�� �ܼ�â�� ���� �Է��� �� ���� �ޱ����� ��ü

		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ��� : ");
		String jumin1 = sc.next(); // 111111
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ��� : ");
		String jumin2 = sc.next(); // 1111011
		
		// ctrl + shift + "f" : �ڵ� �������ִ� ����Ű
		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}
	}

}
