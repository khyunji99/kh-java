package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing : 기본형(stack메모리) -> 참조형(heap메모리) 로 복사
		Integer obj1 = new Integer(100);  // boxing: 참조형 <- 기본형
		// int형 객체가 Integer 객체로 변환..?
		// int형을 boxing하는 것은 Integer클래스가 해준다
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("350");
		// String 값도 Integer 객체로 변환..?
		
		// Unboxing
		int value1 = obj1.intValue();  // unboxing: 기본형 <- 참조형
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
	}
}
