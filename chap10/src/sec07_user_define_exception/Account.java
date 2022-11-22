package sec07_user_define_exception;

public class Account {
	// 필드
	private long balance;     // private o x x x (같은 클래스에서만 접근가능)

	// 기본 생성자
	public Account() { }	

	// 메서드
	public long getBalance() {// public o o o o
		// getter, setter메서드 내부에 내가 원하는 로직을 만들 수 있음 (좋은점)
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;     // balance = balance + money; 
	}
	
	// 예외 떠넘기기(메서드명 + throws + 예외클래스 { })
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			// 예외 발생 가능한 코드
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}

