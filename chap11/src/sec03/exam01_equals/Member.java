package sec03.exam01_equals;

// ��ü �� (equals( ))
// �⺻������ == �����ڿ� ������ ����� ���� (����ִ� �ּҰ��� ��)
// ���� ������ ���ϱ� ���ؼ� equals() �޼��� ������(�������̵�) �ʿ���
public class Member /* extends Object */ {
	// �ʵ�(�������)
	public String memberID;
	
	// ������
	public Member(String memberID) { 
		this.memberID = memberID;
	}

	// Object Ŭ������ �ִ� equals() �޼��� ������	
	@Override
	public boolean equals(Object obj) {  // Object obj = new Member();
		if (obj instanceof Member) {
			Member member = (Member)obj; // �ٿ� ĳ������ ���� : id�� ���ϰ� ������ id��������� Member Ŭ�������� �ִ� ���̹Ƿ� MemberŬ������ �ٿ�ĳ���� ������Ѵ�.
			if (memberID.equals(member.memberID)) { // if���� ���ǽĿ� �ִ� equals�޼���� String��ü? Ŭ������ �ִ� equals �޼����̴�.
				return true;
			}
		}
		return false;
	}
	
	
}
