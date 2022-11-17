package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	// 필드
	// 생성자
	public SmartPhone(String owner) {
	//  super();      <- 오류 부모 클래스에는 기본 생성자가 없기 때문 
		super(owner);
	}
	// (일반) 메서드
	public void internetSearch() {
		System.out.println("인터넷을 검색 합니다.");
	}
	
	
}
