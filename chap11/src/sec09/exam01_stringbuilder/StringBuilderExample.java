package sec09.exam01_stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");  // "Java Program Study"
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); // 4번째 인덱스 문자열에 문자 "2" 넣기
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();
		System.out.println(result);		
	}
}
// 문자열 결합 연산자 +
// 새로운 데이터 문자열을 추가할때, 결합할 때 +를 사용해서
// 새로운 객체를 생성하여 기존데이터와 추가할 데이터까지 다 추가하여
// 새로 생성된 객체에 데이터를 넣어준다.
// 이러면 새로 데이터를 추가할때마다 객체를 매번 생성해야하니
// 메모리 공간 줄어듦 --> 비효율적
// 그럴때 StringBuffer( ) , StringBuilder 사용
// 멀티 스레드환경일때 (cpu가 두개이상일때), StringBuffer( ) 사용
// 단일 스레드환경일때 (cpu가 하나일때), StringBuilder( ) 사용
// 둘은 동일한 기능을 가지는데 다음과 같다.
// 버퍼(buffer : 데이터를 임시로 저장하는 메모리)에 문자열을 저장함
// --> 버퍼 내부에서 추가, 수정, 삭제 등의 작업이 가능함
// --> String처럼 새로운 객체를 만들지 않아도 문자열을 조작할 수 있음


