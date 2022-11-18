package sec05.exam03_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// Bus, Taxi 구현객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 매개변수의 다형성
		// 메서드의 매개변수를 인터페이스 타입으로 만들어서
		// 여러개의 구현객체를 넣을 수 있고
		// 매개변수에 들어가는 구현객체에 따라 호출되는 메서드도 달라져
		// 출력되는 값이 달라진다.
		driver.dirve(bus);  // Vehicle vehicle = new Bus(); <-- 자동형변환
		driver.dirve(taxi);
		
    }
}

//    추상클래스     VS  인터페이스
// "매개변수명 통일"  VS  "다형성"