package sec07.exam02_method;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		
		int location = subject.indexOf("프로그래밍");
		// 프로그래밍 이라는 문자열이 있으면
		// 그 문자열이 시작하는 인덱스 값을 리턴
		System.out.println(location);
		// 3 리턴
		// "프로그래밍" 문자열이 있으면
		// '프'가 있는 인덱스의 번호가 리턴된것
		
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요 !");
		} else {
			System.out.println("자바와 관련이 없는 책이군요..");
		}
		
	}
}

