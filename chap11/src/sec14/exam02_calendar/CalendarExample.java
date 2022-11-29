package sec14.exam02_calendar;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		// Calendar now = new Calendar();
		// 위처럼 Calendar 클래스로 인스턴스 생성할 수 없다.
		
		// Calendar 객체 생성하는 방법
		// 1. Calendar.getInstance();
		// Calendar now = Calendar.getInstance();
		// 2. Calendar 클래스의 자식 클래스인 GregorianCalendar 객체를 생성하여
		//    Calendar 타입에 형변환시킨다.
		Calendar now = new GregorianCalendar();
		// GregorianCalendar 클래스는 윤년을 만드는 클래스
		
		
		int year    = now.get(Calendar.YEAR);             
		int month  = now.get(Calendar.MONTH) + 1;
		// Calendar.MONTH : 실제 월에서 -1을 감소한 값이 리턴된다.
		// 따라서 1을 더해줘야 내가 원하는 실제 월이 리턴된다. 
		int day    = now.get(Calendar.DAY_OF_MONTH);     
		
		int week    = now.get(Calendar.DAY_OF_WEEK);        
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY: // 2
				strWeek = "월";
				break;
			case Calendar.TUESDAY: // 3
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY: // 4
				strWeek = "수";
				break;
			case Calendar.THURSDAY: // 5
				strWeek = "목";
				break;
			case Calendar.FRIDAY: // 6
				strWeek = "금";
				break;
			case Calendar.SATURDAY: // 7
				strWeek = "토";
				break;
			default:  // 그외 숫자
				strWeek = "일";
		}
		
		int amPm  = now.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) { // 0
			strAmPm = "오전";
		} else { // 1
			strAmPm = "오후";
		}
		
		int hour    = now.get(Calendar.HOUR);                 
		int minute  = now.get(Calendar.MINUTE);             
		int second  = now.get(Calendar.SECOND);              

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}
}

