package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance() + "원");
		
		// 출금하기
		try {
			// 예외 발생 가능한 코드
			account.withdraw(15000);
		} catch (BalanceInsufficientException e) {
			// Exception 예외 클래스를 상속받고 있는
			// BalanceInsufficientException 하위클래스 타입의 변수 e
			// 여기에 예외가 발생하면 나타나는 메세지가 들어온다.
			// 그 메세지를 getMessage() 메서드로 가져와서 message 변수에
			// 넣어준다.
			String message = e.getMessage(); // e.getMessage() : 문자열 반환
			System.out.println(message);
			
			// e.printStackTrace() : 예외에 대한 상세 정보를 반환
			e.printStackTrace();
			
		}
	
	
	
	}
}
