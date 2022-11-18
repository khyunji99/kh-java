package sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television 구현객체
		rc = new Television();
		rc.turnOn();        // 추상메서드도 마찬가지이다.
		rc.setMute(true);   // 구현객체를 만들어서 참조변수에 대입한 후
		                    // 참조변수.디폴트메서드()로 디폴트메서드에 접근한다.
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
