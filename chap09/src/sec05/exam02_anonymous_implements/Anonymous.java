package sec05.exam02_anonymous_implements;

public class Anonymous {
	// 1) 필드 초기값으로 익명구현객체를 대입
	RemoteControl field = new RemoteControl() {
		// 인터페이스 RemoteControl 에 있는 추상 메서드 모두 재정의
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		// 2) 로컬변수값으로 익명구현객체를 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		//로컬변수 사용
		localVar.turnOn();
	}
	
	// 메서드의 매개변수가 RemoteControl 인터페이스로 만든 변수
	// 그런데 이 매개변수에 지금 익명 구현 객체가 들어올 것임
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}











