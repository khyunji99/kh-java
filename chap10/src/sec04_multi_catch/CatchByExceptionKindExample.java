package sec04_multi_catch;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			// 예외 발생 가능한 코드
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 예외 처리할 수 있는 방법을 코드로 작성
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample  num1  num2");
			
		} catch(NumberFormatException e) {
			// NumberFormatException 예외 처리할 수 있는 방법을 코드로 작성
			System.out.println("숫자로 변환할 수 없습니다.");
			
		} finally {
			// 무조건 실행하는 코드
			System.out.println("다시 실행하세요.");
		}
	}
}
