package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		// String형 배열의 원소에는 & 또는 , 또는 - 의 구분자들로
		// 문자열이 쪼개진 문자열들이 배열에 들어간다.
		// 즉, String[] names = {"홍길동", "이수홍", "박연수", "김자바", "최명호"};
		// 이렇게 된다.
		
		
		String text2 = "나는,너무,예뻐";
		String[] words = text2.split(",");
		
		
		// 배열의 원소들을 하나씩 출력할때는
		// 다음과 같이 향상된 for문을 사용해서 출력하는게 더 좋다.
		System.out.println("--- 향상된 for문 출력 ---");
		for(String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println("--- 일반적인 for문 출력 ---");
		// 일반적인 for문
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		System.out.println();
		System.out.println("--- 향상된 for문 출력 ---");
		for(String word : words) {
			System.out.print(word + " ");
		}
		
	}
}
// split()
// String[] result = "문자열".split("정규표현식");
// 정규표현식을 구분자로 해서 문자열을 분리한 후 배열에 저장하고 리턴한다.
// ex) String[] name = text.split("& | , | -");