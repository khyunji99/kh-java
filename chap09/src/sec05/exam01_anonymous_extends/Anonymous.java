package sec05.exam01_anonymous_extends;

public class Anonymous {
	
	// 필드
	// 1) 필드에 익명 자식 객체를 대입해서 필드 값 초기화
	// 부모클래스형 + 변수 = new + 익명 자식 객체
	// 부모 클래스 데이터 타입의 멤버변수에 익명 자식 객체를 대입 즉, 초기화하는 것이다.
	Person field = new Person() {
		// 필드
		// 메서드
		void work() {
			System.out.println("회사로 터덜터덜 출근을 합니다.");
		}
		
		// Person 인터페이스에 선언된 추상 메서드 재정의
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		
	};
	
	// 생성자
	
	// 메서드
	void method1() {
		// 로컬 변수(선언된 {}가 끝나면 사라진다.)
		// 2) 로컬변수 값에 익명 자식 객체 대입
		// 부모 클래스형 + 변수 = 익명 자식 객체 대입 <-- 익명 자식 객체 생성
		// 메서드 안에 있는 지역변수 값에 익명 자식 객체를 대입하는 것이다.
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("여유롭게 산책을 합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake(); // method1() 메서드를 실행하는 것이다..?
		
	}
	
	
	void method2(Person person) {
		person.wake();
	}
	
	
}











