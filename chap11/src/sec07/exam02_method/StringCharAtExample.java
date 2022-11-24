package sec07.exam02_method;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		// ssn에 들어가있는 문자열의 7번 인덱스의 문자를 불러온다.
		// charAt() : 문자열의 특정 인덱스에 있는 문자를 리턴하는 메서드
		
		switch(sex) {
		case '1': case '3':
			System.out.println("남자 입니다.");
			break;
			
		case '2': case '4':
			System.out.println("여자 입니다.");
			break;
			
		}
	}
}

