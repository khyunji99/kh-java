package sec14.exam02_calendar;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		// Calendar now = new Calendar();
		// ��ó�� Calendar Ŭ������ �ν��Ͻ� ������ �� ����.
		
		// Calendar ��ü �����ϴ� ���
		// 1. Calendar.getInstance();
		// Calendar now = Calendar.getInstance();
		// 2. Calendar Ŭ������ �ڽ� Ŭ������ GregorianCalendar ��ü�� �����Ͽ�
		//    Calendar Ÿ�Կ� ����ȯ��Ų��.
		Calendar now = new GregorianCalendar();
		// GregorianCalendar Ŭ������ ������ ����� Ŭ����
		
		
		int year    = now.get(Calendar.YEAR);             
		int month  = now.get(Calendar.MONTH) + 1;
		// Calendar.MONTH : ���� ������ -1�� ������ ���� ���ϵȴ�.
		// ���� 1�� ������� ���� ���ϴ� ���� ���� ���ϵȴ�. 
		int day    = now.get(Calendar.DAY_OF_MONTH);     
		
		int week    = now.get(Calendar.DAY_OF_WEEK);        
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY: // 2
				strWeek = "��";
				break;
			case Calendar.TUESDAY: // 3
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY: // 4
				strWeek = "��";
				break;
			case Calendar.THURSDAY: // 5
				strWeek = "��";
				break;
			case Calendar.FRIDAY: // 6
				strWeek = "��";
				break;
			case Calendar.SATURDAY: // 7
				strWeek = "��";
				break;
			default:  // �׿� ����
				strWeek = "��";
		}
		
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) { // 0
			strAmPm = "����";
		} else { // 1
			strAmPm = "����";
		}
		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);              

		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.println(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "�� ");
	}
}

