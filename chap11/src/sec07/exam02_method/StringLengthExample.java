package sec07.exam02_method;

public class StringLengthExample {
	public static void main(String[] args) {
		
		String[] strs = new String[100]; 
		// String 값이 원소인 배열 (문자열 배열) 생성
		// 배열의 크기는 100으로 지정
		System.out.println("배열의 길이 = " + strs.length);
		// 100 출력
		
		String ssn = "7306241230123";
		// 문자열
		int length = ssn.length();
		// length() : 문자열 길이
		/** 공백도 문자에 포함이다 **/
		System.out.println("문자열의 길이 = " + ssn.length());
		// 13 출력
	}
}

