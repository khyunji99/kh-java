package sec03.exam01_name_implement_class;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		// rc 는 참조변수이자 지역변수
		// rc는 인터페이스타입이다.
		// RemoteControl이 인터페이스 이기 때문이다.
		RemoteControl rc;
		
		// RemoteControl 인터페이스를 구현한 Television 구현객체 생성
		// 인터페이스형 변수 = 구현객체(Television구현클래스형) --> 자동형변환
		rc = new Television(); // 객체 교환..?
		
		rc.turnOn();  // Television 구현클래스에 있는 turnOn() 메서드가 호출된다.
		
		
		// RemoteControl 인터페이스를 구현한 Audio 구현객체 생성
		// rc는 RemoteControl 인터페이스형 타입의 변수인데 여기에
		// Audio 구현클래스형 타입을 넣은 것이므로 형이 다르다.
		// 그런데 Audio 구현클래스는 인터페이스를 구현한, 상속받은 클래스이므로
		// 자동으로 형변환이 된다.
		// 얘도 자동형변환이다.
		rc = new Audio();
		
		
	}
}
