package sec14.exam01_date;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		// ���� �ð��� ��¥ ��ȯ
		String strNow1 = now.toString();
		System.out.println(strNow1);
		// Tue Nov 29 16:38:47 KST 2022 ���
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		// HH --> 24�� �������� �ð� ���� , hh --> ���� ���� ����� �ð� ����
		String strNow2 = sdf.format(now);
		// �ð��� ��¥ ����ϴ� ���� �ٲٴ� �޼���..?
		System.out.println(strNow2);
		// 2022�� 11�� 29�� 04:38:47 ���
	}
}

