package sec05.exam02_gc;

// gc( ) : 쓰레기 수집기 실행
// 강제로 가비지 콜렉터를 돌리는 메서드
public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;		
		emp = new Employee(2);		
		emp = new Employee(3);
		
		System.out.print("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		// 현재 참조하고 있는것 말고 나머지 객체들만 제거됨
		System.gc();	
	}
}

