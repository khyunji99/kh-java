package sec07.exam02_method;

public class StringValueOfExample {
	public static void main(String[] args) {
		int num = 10;
		String str1 = String.valueOf(num); // 형변환 : 참조형(String) <- 기본형(int)
		// num값인 정수 10을 문자열 "10"로 변환해서 str1에 넣어준다.
		// 자세히 설명하자면 int형 num 변수에 10이라는 값이 넣어진다.
		// 그 num 변수에 들어있는 값 10을 가지고
		// String 객체를 만들어 그 10을 넣는다.
		// 10이라는 값이 int형에서 String형으로 변환된것
		// 그 String 객체의 주소값을 str1 참조변수에 넣어지게 된다.
		
		System.out.println(str1); // "10" 출력
		
		String str2 = String.valueOf(10.5);
		// double형 10.5가 String형 "10.5"로 변환됨
		String str3 = String.valueOf(true);
		// boolean형 true가 String형 "true"로 변환됨
		
		System.out.println(str2); // "10.5" 출력
		System.out.println(str3); // "true" 출력
		
		
	}
}

// valueOf( ) : 문자열 변환
// 기본형 타입들을 문자열로 반환해주는 메서드
// 형변환을 한다 : 참조형 <- 기본형
