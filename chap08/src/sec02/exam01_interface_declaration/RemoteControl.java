package sec02.exam01_interface_declaration;

public interface RemoteControl {
	// 상수
	static final int MAX_VOLUME = 10;
	
	// 이렇게 (public) static final 생략해도 괜찮다.
	int MIN_VOLUME = 0;
	
	
	// 추상 메서드
	// 인터페이스를 구현한 구현 클래스를 만들기 위해서는
	// 추상메서드를 꼭 구현(재정의) 해야한다.
	abstract void turnOn();
	
	// 이렇게 (public) abstract 생략해도 괜찮다.
	void turnOff();
	void setVolume(int volume);
	
	
	// 디폴트 메서드
	default void setNute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
	
}
