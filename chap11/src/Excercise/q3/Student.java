package Excercise.q3;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj; // 강제형변환
			if(this.studentNum == student.studentNum) {
				// this.studentNum.equals(student.studentNum) 으로 적어도 됨
				// == 로 비교해도 되는 이유는 같은 값을 가지고 있는 String형 객체의
				// 주소값은 동일하기 때문에 주소값 비교하는 == 로 비교해도 괜찮다.
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
		// 자기 객체에 들어있는 필드 studentNum의 해시코드를 리턴하도록
		// Object 클래스에 있는 hashCode() 메서드 재정의
	}
	
}
