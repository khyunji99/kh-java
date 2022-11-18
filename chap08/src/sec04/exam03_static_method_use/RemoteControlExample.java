package sec04.exam03_static_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("추상메서드 turnOn() 실행");
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		rc.turnOn();       // 추상 메서드 호출 (참조변수.추상메서드)
		rc.setMute(true);  // 디폴트 메서드 호출 (참조변수.디폴트메서드)
		
		RemoteControl.changeBattery();  // 정적 메서드 호출
		                                // 정적 메서드는 구현객체를 담은 참조변수 없이 그냥 인터페이스명으로 접근할 수 있다.
	}
}
