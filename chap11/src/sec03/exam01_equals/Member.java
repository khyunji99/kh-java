package sec03.exam01_equals;

// ��ü �� (equals( ))
// �⺻������ == �����ڿ� ������ ����� ���� (����ִ� �ּҰ��� ��)
// ���� ������ ���ϱ� ���ؼ� ������(�������̵�) �ʿ���
public class Member extends Object {
	// �ʵ�
	public String memberID;
	
	// ������
	public Member(String memberID) {
		this.memberID = memberID;
	}

	// Object Ŭ������ �ִ� �޼��� �������� �޼���	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj; // �ٿ� ĳ������ ���� : id�� ���ϰ� ������ id��������� Member Ŭ�������� �ִ� ���̹Ƿ� MemberŬ������ �ٿ�ĳ���� ������Ѵ�.
			if (memberID.equals(member.memberID)) {
				return true;
			}
		}
		return false;
	}
	
	
}
