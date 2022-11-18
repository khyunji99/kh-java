package sec04.exam03_static_method_use;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드 (구현 객체를 만들지 않아도 바로 접근을 할 수 있다.)
	// 추상 메서드나 디폴트 메서드는 구현객체를 만들어야 접근할 수 있다.
	// 참조변수.추상메서드 or 참조변수.디폴트메서드 이렇게 적어서
	// 디폴트메서드나 추상메서드에 접근한다.
	// 하지만 정적 메서드는 이렇게 구현객체를 만들지 않고도 인터페이스명으로
	// 정적 메서드에 접근하여 사용할 수 있다.
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
