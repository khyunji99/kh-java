package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1(); // 작업 스레드 생성
		user1.setCalculator(calculator);
		user1.start();
		// user1 클래스에 있는 run() 메서드 실행됨
		// 100이 출력 되어야 하는데 50이 출력됨
		// Why? user2와 같은 calculator 객체를 사용하고 있기 때문에
		// user1이 먼저 사용하고 다음에 user2가 사용하게 되는데
		// 이때 같은 객체를 사용하고 있기때문에 user2가 값을 지정할때
		// user1도 그 바뀐 값으로 변한다.
		// 따라서 결과적으론 calculator 객체에는 50이라는 값으로 바뀌게 되었으니
		// user1도 50이라는 값으로 출력된다..

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		// user2 클래스에 있는 run() 메서드 실행됨
	}
}
