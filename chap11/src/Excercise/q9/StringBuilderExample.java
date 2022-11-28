package Excercise.q9;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		for(int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		
		
		// StringBuilder 사용해서 문자열 넣기
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append(i+1);
		}
		// StringBuilder 사용해서 문자열 출력	
		System.out.print(sb.toString());
	}
}
