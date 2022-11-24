package sec07.exam02_method;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = new String("신민철");
		String str2 = "신민철";
		String str3 = "신민철";

		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (str2 == str3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//* String 객체의 동등비교는 String형 객체.equals( ) 사용해야한다.
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
		if (str2.equals(str3)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
		
	}
}