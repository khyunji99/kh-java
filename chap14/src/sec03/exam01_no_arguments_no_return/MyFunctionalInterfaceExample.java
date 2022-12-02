package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		
		// 인터페이스이름 + 지역변수;
		MyFunctionalInterface fi;
		
		// 인터페이스 = 익명 구현 객체
		// fi 변수에는 익명 구현 객체가 할당되어 있다.
		fi = new MyFunctionalInterface() {
			@Override
			public void method() {
				String str = "method call1";
				System.out.println(str);
			}
		};
		fi.method();  // "method call1" 출력
		
		
		// 인터페이스 = 람다식
		// 람다식은 익명 구현 객체를 간단하게 적은 식을 의미한다.
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		// 람다식 더 간결하게
		fi = () -> {
			System.out.println("method call1");
		};
		fi.method();
		
		// 더더더 간결하게
		fi = () -> System.out.println("method call1");
		fi.method();
		
	}
}











