package sec04.exam02_generic_method;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		// new Pair< > 이 < > 안에를 생략해서 적을 수 있다.
		
		boolean result = Util.<Integer, String>compare(p1, p2);
		
		if(result) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");
		
		boolean result2 = Util.compare(p3, p4);
		// 제네릭 타입 <String, String> 생략해서 사용해도 문제 없다.
		
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
	}
}
