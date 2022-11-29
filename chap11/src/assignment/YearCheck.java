package assignment;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?"); // "2002"
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(); // 2002

		// ctrl + shift + "f"
		// 윤년의 정의 : year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		} else {
			System.out.println(year + "은 평년");
		}
		
		
		
		// GregorianCalendar 클래스의 윤년을 체크하는
		// isLeapYear() 메서드를 사용하여 윤년 여부를 검사해보자.
		// 윤년이면 true 반환, 평년이면 false 반환
		System.out.println();
		System.out.println("------- GregorianCalendar로 윤년 체크 --------");
		
		GregorianCalendar gc = new GregorianCalendar();
		
		if (gc.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다.");
		} else {
			System.out.println(year + "은 평년입니다.");
		}
		
		
		
		
		
		
		
		
		

	}

}
