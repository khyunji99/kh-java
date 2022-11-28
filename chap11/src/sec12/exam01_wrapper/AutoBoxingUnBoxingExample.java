package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
//		Integer obj = new Integer(10);  // boxing
		// Auto Boxing
		Integer obj = 10;  // Auto Boxing : 참조형 <- 기본형
		
		// 대입시 Auto Unboxing
		int value = obj;   // Auto Unboxing : 기본형 <- 참조형
		System.out.println("value = " + value);
		
		// 연산시 Auto Unboxing
		int result = 100 + obj;
		// 원래 연산은 같은 형끼리 연산이 된다. 그런데 지금 100은 int형
		// obj는 참조형인데 자동적으로 참조형이 기본형이 된다.
		// 이걸 연산시 Auto Unboxing이라고 한다.
		System.out.println("result = " + result);
	}
}

