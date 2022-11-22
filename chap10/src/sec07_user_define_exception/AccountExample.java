package sec07_user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance() + "��");
		
		// ����ϱ�
		try {
			// ���� �߻� ������ �ڵ�
			account.withdraw(15000);
		} catch (BalanceInsufficientException e) {
			// Exception ���� Ŭ������ ��ӹް� �ִ�
			// BalanceInsufficientException ����Ŭ���� Ÿ���� ���� e
			// ���⿡ ���ܰ� �߻��ϸ� ��Ÿ���� �޼����� ���´�.
			// �� �޼����� getMessage() �޼���� �����ͼ� message ������
			// �־��ش�.
			String message = e.getMessage(); // e.getMessage() : ���ڿ� ��ȯ
			System.out.println(message);
			
			// e.printStackTrace() : ���ܿ� ���� �� ������ ��ȯ
			e.printStackTrace();
			
		}
	
	
	
	}
}
