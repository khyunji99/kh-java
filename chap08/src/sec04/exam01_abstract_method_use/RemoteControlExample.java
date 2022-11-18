package sec04.exam01_abstract_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		
		// 각각 Television의 turnOn(), turnOff() 실행
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		
		// 각각 Audio의 turnOn(), turnOff() 실행
		rc.turnOn();
		rc.turnOff();
	}
}
