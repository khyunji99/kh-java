package sec03.exam01_equals;

// 객체 비교 (equals( ))
// 기본적으로 == 연산자와 동일한 결과를 리턴 (담고있는 주소값을 비교)
// 논리적 동등을 비교하기 위해선 재정의(오버라이딩) 필요함
public class Member extends Object {
	// 필드
	public String memberID;
	
	// 생성자
	public Member(String memberID) {
		this.memberID = memberID;
	}

	// Object 클래스에 있는 메서드 재정의한 메서드	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj; // 다운 캐스팅한 이유 : id를 비교하고 싶은데 id멤버변수는 Member 클래스에만 있는 것이므로 Member클래스로 다운캐스팅 해줘야한다.
			if (memberID.equals(member.memberID)) {
				return true;
			}
		}
		return false;
	}
	
	
}
