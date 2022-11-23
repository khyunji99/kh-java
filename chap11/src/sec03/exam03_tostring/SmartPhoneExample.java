package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Google", "Android");
		
		// SmartPhone 클래스가 상속받는 부모 클래스인
		// Object 클래스에서 가져온 toString 메소드
		// toString 메서드가 반환해주는 것은 
		// 하지만 SmartPhone 클래스에서 toString 메서드를 재정의해주면
		// 내가 원하는 의미있는 값을 출력할 수 있다.
		// toString 메서드 재정의 전 출력값
		// : sec03.exam03_tostring.SmartPhone@1c4af82c
		// toString 메서드 재정의 후 출력값
		// : Google , Android
		String strObj = myPhone.toString(); 
		System.out.println(strObj);
		
		System.out.println(myPhone);
		System.out.println(myPhone.toString());
		
		
	}
}
