package sec02_runtime_exception;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";  // "100" 는 숫자 형태의 문자
		String data2 = "a100";
		
		// Integer.parseInt()
		// ( ) 안에 String 변수가 들어오는데 그 String타입의
        // 변수를 10진수 정수형으로 읽어 반환하는 함수
		int value1 = Integer.parseInt(data1);
		
		// NumberFormatException 발생
		// Integer.parseInt("문자열"): 문자열 -> 숫자 => 오류발생
		// "숫자" 이러한 형태의 String형 변수가 ( ) 안에 들어와야
		// 정수형으로 읽을 수 있는데 "문자열" 이러한 형태로 ( ) 안에 들어와버려서
		// 읽을 수 없어서 NumberFormatException 가 발생 
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}

