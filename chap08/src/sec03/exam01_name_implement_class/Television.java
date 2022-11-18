package sec03.exam01_name_implement_class;

// RemoteControl 인터페이스를 구현한 Television 구현클래스
public class Television implements RemoteControl {
	// 필드
	private int volume;
	
	// 추상메서드 구현
	// 재정의를 통해 인터페이스의 추상메서드를 구현한다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume; 
		}
		
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
	
}
