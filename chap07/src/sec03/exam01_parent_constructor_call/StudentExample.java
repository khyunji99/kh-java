package sec03.exam01_parent_constructor_call;

public class StudentExample {
	// 필드
	// 생성자
	// 메서드
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("이름 : " + student.name);
		System.out.println("주민번호 : " + student.ssn);
		System.out.println("학번 : " + student.studentNo);
	}
}

