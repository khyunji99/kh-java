package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("---- try-catch문 ----");
		
		String data1 = null;
		String data2 = null;
		
		try {
			// 예외가 발생할 가능성이 있는 코드 입력
			data1 = args[0]; // args[] 배열에는 값이 없기 때문에 예외 발생
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			// 예외를 처리해줄 수 있는 코드 입력
			// java ClassName 클래스에 num1과 num2의 값을 넣으라는
			// 예외를 처리할 수 있는 방법 알려주기
			System.out.println("[실행방법]");
			System.out.println("java ClassName num1 num2");
			
			return;  // return; : main() 메서드를 마침으로써 프로그램 종료시키는 것을 의미
		}
		// data1과 data2에 값 넣어주면 실행된다.
		// 값 넣어주는 방법 : 이 클래스에 마우스 가져다가 우클릭
		// -> Run as 클릭 -> Run Configuration 클릭
		// -> Arguments 탭 클릭 -> Program argument에 값 적어주기
		// -> Run 누르기
		// 값 안넣어주면 실행 안되고 앞에 있는 try-catch문 실행됨
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		
		
		System.out.println("---- try-catch-finally문 ----");
		
		
		try {
			// 예외 발생 가능한 코드
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			// 위에서 예외가 발생하지 않으면 다음의 코드가 실행됨
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			
		}catch(NumberFormatException e) {
			// 예외 처리 코드
			System.out.println("숫자로 변환할 수 없습니다.");
			
		}finally {
			// 무조건 실행하는 코드
			System.out.println("다시 실행하세요.");
		}
		
	}
}

