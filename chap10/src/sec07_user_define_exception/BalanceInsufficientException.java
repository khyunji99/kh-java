package sec07_user_define_exception;

// Exception ���� Ŭ������ ��ӹ޴� BalanceInsufficientException ����Ŭ����
// �� Ŭ������ ��������� ���� Ŭ����
// ����� ���� ���� Ŭ������ ������ ���� ��ӹ޴� ��ó�� extends Ű���带 ����ϰ�
// �� �ڿ� �ֻ��� ���� Ŭ���� Exception�� �����ְų� RuntimeException ���� Ŭ������
// �����ָ� ����� ���� ���� Ŭ������ ���������.
public class BalanceInsufficientException extends Exception {
	
	// �⺻ ������
	public BalanceInsufficientException() {}
	
	// �Ű����� �޴� ������
	public BalanceInsufficientException(String message) {
		super(message);   // �θ������ ȣ��
	}
	
	
	
}

