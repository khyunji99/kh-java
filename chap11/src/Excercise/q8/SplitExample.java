package Excercise.q8;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		System.out.println("--- split() 메서드 사용해서 출력 ---");
		//1. split() 메서드 사용
		String[] str1 = str.split(",");
		for (String words : str1) {
			System.out.println(words);
		}
		
		//2. StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int countTokens = st.countTokens();
		
		System.out.println("--- StringTokenizer&토큰 개수 사용해서 출력 ---");
		//(1) 전체 토큰 수를 얻어서 일반적인 for문으로 출력
		for ( int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println("--- StringTokenizer&남은 토큰 사용해서 출력 ---");
		//(2) 남아있는 토큰을 확인하고 while문으로 출력
		st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
