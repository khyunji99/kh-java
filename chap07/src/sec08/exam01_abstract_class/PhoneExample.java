package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동");
//	    -> abstract 클래스로 객체 생성 불가
		
		
//		자식 클래스를 가지고 객체를 만들게 되면 먼저 부모 클래스의 생성자가 호출되고
//		그 후에 자식 클래스의 생성자가 호출되면서 객체가 만들어진다.
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();         // 상속받은 부모 클래스에서 정의된 메서드
		smartPhone.internetSearch(); // 자식 클래스에서 정의된 메서드
		smartPhone.turnOff();        // 상속받은 부모 클래스에서 정의된 메서드
		
		
		
	}
}
