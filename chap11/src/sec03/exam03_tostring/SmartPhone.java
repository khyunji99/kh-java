package sec03.exam03_tostring;

public class SmartPhone {
	// �ʵ�
	private String company;
	private String os;
	
	// ������ : ��ü�� �����ϰ�, �ʵ� �ʱ�ȭ�� ����
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	// ��ü.toString()�� �ַ� �ν��Ͻ� �ʵ��� ����
	// ����ϱ� ���� �������ؼ� ����Ѵ�.
	// toString( ) �������� �޼���
	@Override
	public String toString() {
		return this.company + " , " + this.os;
	}
	
	
}
