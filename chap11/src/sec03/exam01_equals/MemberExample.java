package sec03.exam01_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
		// 재정의한 equals 메서드를 호출하는 것이라면
		// obj1이 참조하고 있는 값
		// 즉, obj1이 가지고 있는 주소값이 가리키고 있는 객체가 가지고 있는 값과
		// obj2이 참조하고 있는 값
		// 즉, obj2가 가지고 있는 주소값이 가리키고 있는 객체가 가지고 있는 값과
		// 이 같은지 물어보게 된다. obj1이 가지고 있는 주소값이 가리키는 
		// 객체가 가지고 있는 값은 blue이고 
		// obj2가 가지고 있는 주소값이 가리키는 객체가 가지고 있는 값도
		// blue이므로 재정의한 equals메서드가 호출되어 실행되면
		// 동등하다고 출력된다.
		// 만일 재정의된 equals 메서드가 아닌 그냥 Object 클래스에서 주는
		// equals메서드로 호출해서 실행한다면 동등하지 않다고 출력된다.
		// 왜? obj1과 obj2가 가지고 있는 주소값은 다르기 때문이다.
		// Object obj2 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}
