package sec07_user_define_exception;

// Exception 예외 클래스를 상속받는 BalanceInsufficientException 하위클래스
// 이 클래스는 사용자정의 예외 클래스
// 사용자 정의 예외 클래스를 선언할 때는 상속받는 것처럼 extends 키워드를 사용하고
// 그 뒤에 최상위 예외 클래스 Exception을 적어주거나 RuntimeException 예외 클래스를
// 적어주면 사용자 정의 예외 클래스가 만들어진다.
public class BalanceInsufficientException extends Exception {
	
	// 기본 생성자
	public BalanceInsufficientException() {}
	
	// 매개변수 받는 생성자
	public BalanceInsufficientException(String message) {
		super(message);   // 부모생성자 호출
	}
	
	
	
}

