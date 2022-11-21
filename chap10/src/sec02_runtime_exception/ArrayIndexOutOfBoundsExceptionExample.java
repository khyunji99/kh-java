package sec02_runtime_exception;

  // 배열에서 인덱스 범위 초과하여 사용할 때 발생하는 예외
  // 두개의 실행 매개값을 주지 않았기 때문에 args[0], args[1] 인덱스를 사용할 수 없다.
  // 해결방법 : ArrayIndexOutOfBoundsException이 발생하는 클래스에서
  //          우클릭 후 Run as 탭 > Run Configuration 탭
  //        > Arguments 탭 > Program Arguments 에 내가 지정할 값 적기
  //        예를 들어 인덱스 0번에 a3값, 1번 인덱스에 a4값 넣어주고 싶다면
  //        a3 a4로 적어주면 args[0], args[1] 배열에 값이 생기므로
  //        정상적으로 실행 된다.
    public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];  // ArrayIndexOutOfBoundsException 발생
		
		System.out.println("args[0]: " + data1); 
		System.out.println("args[1]: " + data2);
	}
}

/* public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);  // ArrayIndexOutOfBoundsException 발생
			System.out.println("args[1]: " + data2);
			
		}
		else {
			System.out.println("[실행 방법]");
			System.out.println("java className 매개변수1 매개변수2");
		}
	}
}
*/
