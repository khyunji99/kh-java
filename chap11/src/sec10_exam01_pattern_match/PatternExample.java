package sec10_exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";  // 정규식
		//(02|010) --> 02 또는 010 이 와야함을 의미
		// \d --> 특수기호, 한개의 숫자가 와야하는 의미
		// \t --> 특수기호, 탭 키를 의미함
		// \\d --> 특수기호 앞에 \를 하나 더 붙인 이유는 뒤에 나오는 \d를
		//         특수기호로 보는 것이 아니라 그냥 \문자열로 봐라 라고 말해주는 것
		// -\\d {3,4} - --> - - 사이에 숫자가 3개에서부터 4개까지가 온다
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		// 유효성 검토 : 필요한 특정 데이터 포맷에 맞는지 검증하는 것
		// ex) 이메일 형식, 전화번호 형식, 비밀번호 형식 등이 맞는지 검증
		// boolean result = Pattern.matches("정규식", "입력된 문자열");
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		// \w --> 한개의 알파벳 또는 한개의 숫자가 와야함을 의미
		// \\w+ 알파벳이 한개 또는 한개 이상이 와야한다.
		// (\\.\\w+)? --> ( ) 안에 있는 애들이 한개 있거나 없어야 함을 의미
		data = "angel@navercom"; // naver.com 처럼 . 이 없어서 정규식과 일치하지 않는다.
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
