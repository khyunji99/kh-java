package sec07.exam02_method;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  010";
		String tel2 = "-1234   ";
		String tel3 = "   -5678   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
		
	}
}

// trim( ) : 문자열의 앞뒤에 있는 공백 잘라내기
