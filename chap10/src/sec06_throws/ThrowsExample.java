package sec06_throws;

/** 예외 떠넘기기 **/
public class ThrowsExample {
	// main() 메서드
	public static void main(String[] args) {
		
		try {
			findClass();  // 예외가 발생할 수 있는 메서드
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
	
	// throws 키워드 : 예외 떠넘길때 사용
	// findClass( ) 메서드
	// static 메서드로 선언하지 않으면 위의 main 메서드에서 이 findClass 메서드
	// 접근할 수 없고 사용도 할 수 없다.
	public static void findClass() throws ClassNotFoundException {
		// 예외가 발생할 수 있는 코드
		Class clazz = Class.forName("java.lang.String2");  
	}
}

