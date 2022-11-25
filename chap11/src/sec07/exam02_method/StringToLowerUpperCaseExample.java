package sec07.exam02_method;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA PROGRAMING";
		
		System.out.println(str1.equals(str2));
		// 대소문자를 다르게 인식하기 때문에 false 출력됨
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		// str1 과 str2 문자열들을 모두 소문자로 변경한 것을
		// 새로운 객체 lowerStr1과 lowerStr2에 각각 넣어줬다.
		// lowerStr1과 lowerStr2은 똑같이 "java programing"
		// 이라는 문자열을 참조하고 있으므로 equals 메서드로
		// 비교했을 때 true 가 출력된다.
		
	}
}

