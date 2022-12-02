package sec03.exam02_arguments;

public class MyMethodReferencesExample { 
	public static void main(String[] args) {
		// 인터페이스이름 + 지역변수;
		MyFunctionalInterface fi;
		
		// 인터페이스 = 익명구현 객체
		fi = new MyFunctionalInterface() {
			@Override
			public void method(int x, int y) {
				int result = x * y;
				System.out.println(result);
			}
		};
		fi.method(5, 5); // 25 = 5*5 출력
		
		// 람다식
		fi = (x, y) -> {
			int result = x * y;
			System.out.println(result);
		};
		fi.method(5, 5);
		
		
		/* 매개변수가 x 하나일때
		 fi = x -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		 */
	}
}











