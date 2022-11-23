package sec03.exam03_tostring;

public class SmartPhone {
	// 필드
	private String company;
	private String os;
	
	// 생성자 : 객체를 생성하고, 필드 초기화를 해줌
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	// 객체.toString()은 주로 인스턴스 필드의 값을
	// 출력하기 위해 재정의해서 사용한다.
	// toString( ) 재정의한 메서드
	@Override
	public String toString() {
		return this.company + " , " + this.os;
	}
	
	
}
