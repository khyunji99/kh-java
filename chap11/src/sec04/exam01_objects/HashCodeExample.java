package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		// Objects.hash(매개변수) 는 매개변수를 가지고 해쉬코드를 생성
		// Objects.hashCode(매개변수 <-- 객체가 매개변수로 들어옴)는
		// 매개변수를 가지고 있는 객체의 필드를 가지고
		// Objects.hash()에 접근해서 해쉬코드를 생성
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {             // 원래는 주소값을 가지고 동일한지를 따져본다. 하지만 지금 재정의하면서
			return Objects.hash(sno, name); // ( ) 안에있는 매개변수들의 값 즉, 여기서는 sno와 name이 같으면 동일하다고 간주하게 만든다.
		}
	}
}
