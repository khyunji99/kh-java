package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// SmartTelevision 구현클래스 가지고 구현객체 생성
		// 익명 구현객체 아님!!
		SmartTelevision tv = new SmartTelevision();
		
		// 인터페이스 = 구현객체
		// 인터페이스형 변수에 구현객체 대입 (자동형변환)
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
