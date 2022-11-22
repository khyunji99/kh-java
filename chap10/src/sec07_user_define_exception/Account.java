package sec07_user_define_exception;

public class Account {
	// �ʵ�
	private long balance;     // private o x x x (���� Ŭ���������� ���ٰ���)

	// �⺻ ������
	public Account() { }	

	// �޼���
	public long getBalance() {// public o o o o
		// getter, setter�޼��� ���ο� ���� ���ϴ� ������ ���� �� ���� (������)
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;     // balance = balance + money; 
	}
	
	// ���� ���ѱ��(�޼���� + throws + ����Ŭ���� { })
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			// ���� �߻� ������ �ڵ�
			throw new BalanceInsufficientException("�ܰ����:"+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}
}

