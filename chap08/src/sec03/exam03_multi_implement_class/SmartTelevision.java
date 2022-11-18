package sec03.exam03_multi_implement_class;

// SmartTelevision 클래스는 RemoteControl 인터페이스와 Searchable 인터페이스를
// 구현하기 위해서는 각각의 인터페이스안에 있는 추상메서드를 반드시 재구현(재정의)해야한다.

// 다음과 같이 인터페이스를 여러개 구현받아서 구현클래스 만들 수 있다.
public class SmartTelevision implements RemoteControl, Searchable {
	
	private int volume;
	
	// RemoteControl 인터페이스에 있는 추상메서드 재구현
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨: " + volume);
	}
	
	
	// Searchable 인터페이스에 있는 추상메서드 재구현
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
