package sec02_runtime_exception;

// 객체가 없는 상태에서 객체를 사용할 때 발생하는 예외
public class NullPointerExceptionExample {
	public static void main(String[] args) {
//		String data;  // 이것도 비어있는 것을 의미
		String data = null;
		
		// toString() 메서드
		// data 가 참조하고 있는 객체 값을 그대로 반환되어 출력되는 것
		// 그런데 data가 가지고 있는 것은 아무것도 없다. (참조하고 있는 것이 없다)
		// 따라서 예외 발생!
		System.out.println(data.toString());  // NullPointerException 예외발생
		
		// 이 아래의 출력문은 예외 발생 이후에 있는 코드이므로 실행 x
		System.out.println("예외 발생 이후에 있는 코드 출력 x");
	}
}

