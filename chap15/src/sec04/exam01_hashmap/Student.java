package sec04.exam01_hashmap;

// 사용자 정의 클래스
public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
		//예) 1 + 33(value값인 name을 가지고 만든 해시코드값) = 34
	}
	// value값인 name을 가지고 해시코드 만들게 해서 sno값과 더한다.
	// 이때 sno값과 value값인 name이 같으면 hashCode가 같게 되므로
	// 둘다 더한 값도 같을 것이다. 그러면 같은것으로 보도록 hashCode() 메서드 재정의한것

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	
	
	
	
}

