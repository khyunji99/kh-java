package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		// Anonymous 데이터 타입의 변수에 Anonymous 객체 생성해서 대입
		Anonymous annoy = new Anonymous();
		
		annoy.field.wake();
		annoy.method1();   // method1에 정의된 익명 자식 객체가 생성되면서
		                   // 그 익명 자식 객체가 들어있는 로컬변수의
		                   // wake() 메서드가 실행된다.
		
		// 인자값에 익명 자식객체를 넣어준 것이다.
		// Person 클래스 타입의 변수를 인자로 만든 것이 아니다!
		// 3) 매개변수에 익명 자식 객체를 대입
		annoy.method2(new Person(){
			void study() {
				System.out.println("공부합니다.");
			}
			// Person 클래스에 있는 wake() 메서드 재정의
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		                  
		
		
		
		
	}
}
