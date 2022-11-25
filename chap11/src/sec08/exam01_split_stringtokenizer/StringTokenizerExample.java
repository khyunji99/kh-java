package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text, "/");
		
		int countTokens = st.countTokens();
		
		// 방법 1
		// 전체 토큰 수를 얻어서 일반적인 for문으로 출력
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		// 방법 2
		// 남아있는 토큰을 확인하고 while문으로 출력
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {  // 토큰이 없을때까지 while문 실행
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
// StringTokenizer 클래스
//