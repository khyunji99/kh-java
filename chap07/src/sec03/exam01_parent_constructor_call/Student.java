package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// 필드
	public int studentNo;  // 학번
	
	// 생성자
	public Student (String name, String ssn, int studentNo) {
		// 상위 클래스인 People 클래스에는 매개변수를 받는 생성자밖에 없다.
		// 따라서 하위 클래스인 Student 클래스에서 생성자를 만들때
		// 상위 클래스의 생성자를 무조건 호출해야하는데 상위 클래스인 People
		// 클래스에는 매개변수를 받는 생성자밖에 없다.
		// 따라서 하위 클래스에서도 매개변수를 받는 생성자를 호출해줘야 한다.
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
}
