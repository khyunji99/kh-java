package sec07.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		// 1 byte = 8 bits ( -128 ~ 127까지의 범위 포용 )
		
		String str1 = new String(bytes); // bytes 배열을 매개변수로 받아 배열에 들어있는 값들에 해당하는 문자들을 모아서 만들어진 문자열을 str1변수에 넣기
		System.out.println(str1);  // "Hello Java" 배열 안에 들어있는 값이 아스키코드 값으로 그 값에 해당하는 문자열을 출력해준다.
		System.out.println(str1.toString());
		
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);  // Java 출력
		
		String str3 = new String(bytes, 0, 5);
		System.out.println(str3);  // Hello 출력
		
	}
}
