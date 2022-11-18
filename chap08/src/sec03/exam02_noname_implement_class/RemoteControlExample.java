package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	
	// 필드 (멤버변수)
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("필드(멤버변수)의 turnOn() 실행");
		}

		@Override
		public void turnOff() {
			
		}

		@Override
		public void setVolume(int volume) {
			
		}
		
	};
	
	
	public static void main(String[] args) {
		// 현재 이 패키지(exam02_noname_implement_class) 내에
		// 구현 클래스가 존재하지 않는다.
		
		// 이렇게 구현 클래스가 없는데 객체를 만들어야 한다면 익명 구현 객체를 만드는게 좋다.
		// 익명 구현 객체의 형태
		// 인터페이스명 + 변수 = new + 인터페이스명() { };
		// 람다식 : 익명구현객체를 단략히(간단하게) 표현하는 식 (나중에 또 나옴)
		// 익명구현객체는 구현클래스를 생성하지 않고도 객체를 만들 수 있다.
		// 한번만 객체를 생성할 목적이라면 익명구현객체를 만들어서 사용하는게
		// 일반구현객체를 사용하는 것보다 효과적이다.
		
		// 익명 구현 객체 생성
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Television의 turnOn() 실행");
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		
		rc.turnOn();
		
		// 다른 익명구현객체를 rc 변수에 넣음
		// 객체 교환성을 이용한 것이다.
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio의 turnOn() 실행");
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		rc.turnOn();
	}
}
