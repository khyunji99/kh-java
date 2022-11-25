package assignment;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {

	// 주민번호 타당성 검사하는 메소드
	public boolean juminCheck (String jumin) { // 111111-1111011
		System.out.println("jumin = " + jumin);
		// 유효성 검사 코드를 아래에 입력하세요.
		// 어쨌든 true 을 리턴해야한다.
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
		
		/** 처음 11로 나눈 몫이 10이상일때 **/
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
		InputStream is = System.in; // ctrl + shift + "o" : 자동으로 필요한거 import 해주는 단축키
		Scanner sc = new Scanner(is); // 키보드에서 콘솔창에 값을 입력한 그 값을 받기위한 객체

		System.out.println("주민번호 앞자리를 입력 하세요 : ");
		String jumin1 = sc.next(); // 111111
		System.out.println("주민번호 뒷자리를 입력 하세요 : ");
		String jumin2 = sc.next(); // 1111011
		
		// ctrl + shift + "f" : 코드 정렬해주는 단축키
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}
	}

}
