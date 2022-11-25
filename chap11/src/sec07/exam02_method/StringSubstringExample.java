package sec07.exam02_method;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567";
		
		// substring(int beginIndex, int endIndex);
		// (beginIndex) 시작점 인덱스부터
		// (endIndex) 끝나는 인덱스 전까지 사이의 문자열을 추출
		String firstNum = ssn.substring(0, 6);
		// 0번째 인덱스부터 5번째 인덱스에 있는 문자들 출력
		System.out.println(firstNum); // 880815 출력
		
		
		// substring(int beginIndex);
		// (beginIndex) 주어진 인덱스부터 문자열 끝까지
		// 문자열 추출
		String secondNum = ssn.substring(7); // 7 인덱스 이후부터 문자열 끝까지 문자들 출력
		System.out.println(secondNum); // 1234567 출력
		
		
	} 
}

