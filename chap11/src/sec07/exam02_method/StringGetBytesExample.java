package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();  // str을 os의 MS-949 characterset으로 변환해서 저장..?
		System.out.println("bytes1.length : " + bytes1.length);
		
		String str1 = new String(bytes1); // byte배열형 bytes1 변수를 가지고 문자열로 출력하기
		System.out.println(str1);    // "안녕하세요" 출력됨
		
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");  // 문자 인코딩
			System.out.println("bytes2.length : " + bytes2.length);  // 10개
			String str2 = new String(bytes2, "EUC-KR");   // 문자 디코딩
			System.out.println("bytes2 -> String : " + str2);  // "안녕하세요"
			
			System.out.println();
			System.out.println("--- 안녕하세요 UTF-8로 인코딩하고 EUC-KR로 디코딩하기 ----");
			byte[] bytes3 = str.getBytes("UTF-8");  // 가변 문자셋 인코딩
			System.out.println("bytes3.length : " + bytes3.length);  // 15개
			String str3 = new String(bytes3, "EUC-KR");   // 문자 디코딩
			System.out.println("bytes3 -> String : " + str3);  // "안녕하세요가 안나오고 글자 깨져서 나옴"
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
