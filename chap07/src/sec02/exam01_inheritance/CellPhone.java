package sec02.exam01_inheritance;

// API(library)용 클래스 : main 메서드가 없는 클래스
// (다른 클래스에서 불러다가 사용하는 클래스)
// 자체 실행이 안된다.
public class CellPhone {
	// 클래스의 구성 멤버
	// 필드
	String model;
	String color;
	
	// 생성자
	public CellPhone() {  // 기본 생성자
		
	}
	
	// 메서드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}

