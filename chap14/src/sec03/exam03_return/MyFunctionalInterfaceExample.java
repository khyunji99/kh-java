package sec03.exam03_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));  // 7 출력
		
		fi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				return sum(x, y);
			}
		};
		// 이렇게 긴 식을 아래처럼 한줄로 아아주 간결하게 적을 수 있다.
			
		
		fi = (x, y) -> sum(x, y);
		// 위의 식 간결하게 적은 코드
		System.out.println(fi.method(3, 5)); // 8 출력
		
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}











