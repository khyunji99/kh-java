package sec03_try_catch_finally;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {
			// 예외 발생 가능한 코드
			// Class.forName("문자열")
			// ( )안에 들어오는 문자열에 해당하는 클래스 객체를 찾아 반환해주는 함수
			Class clazz = Class.forName("java.lang.String2"); // java.lang.String 클래스는 있지만 java.lang.String2 라는 클래스는 존재하지 않아서 예외가 날 것이다. 그러면 catch 구문 실행된다.
			
		} catch(ClassNotFoundException e) { // Exception 은 예외 클래스 중 가장 상위 클래스이다. 따라서 ClassNotFoundException대신 Exception로 적어주면 예외 다 잡아줄 수 있다.
			// 예외 처리하는 코드
			System.out.println("클래스가 존재하지 않습니다.");
			
		}
		
		
	}
}

