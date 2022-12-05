package assignment;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() { // Student의 해시코드 = 학번
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(student.studentNum == studentNum)
				return true;
		} else {
			return false;
		}
		return false;
	}
}
