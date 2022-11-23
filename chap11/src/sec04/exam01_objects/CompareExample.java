package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new  StudentComparator());
		System.out.println(result); // 0 출력 
		result = Objects.compare(s1, s3, new  StudentComparator());
		System.out.println(result); // -1 출력
	} 
	
	static class Student {
		// 필드
		int sno;
		// 생성자
		Student(int sno) {
			this.sno = sno;
		}
	}
	// Comparator<Student> 인터페이스를 구현 클래스
	static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student a, Student b) {
			// a 가 b보다 작으면 -1 출력, 같으면 0 출력, a가 b보다 크면 1 출력을 의미
			/*if(a.sno<b.sno) return -1;
			else if(a.sno == b.sno) return 0;
			else return 1;*/
			return Integer.compare(a.sno, b.sno);
		}
	}
}
