package sec07.exam02_method;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		// "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다." 출력
		System.out.println(newStr);
		// "JAVA는 객체지향언어 입니다. JAVA는 풍부한 API를 지원합니다."
		// oldStr에서 문자열이 바뀌는 것이 아니라
		// oldStr 객체는 그대로 있고 새로운 newStr이라는 객체가 생겨
		// 새로운 newStr 객체에서 문자열을 바꾸는 것이다.
		// 그래서 oldStr을 출력했을 때 그대로 바뀌기 전의 문자열이
		// 출력되는 것이다.
		
		
	}
}

