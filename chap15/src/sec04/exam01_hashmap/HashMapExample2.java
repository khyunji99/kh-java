package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// map에 키, 값 넣기
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		// 메서드 재정의 안한 상태에서는 위의 키값은 동일하지 않다고 본다.
		// hashCode(), equals()메서드들을 재정의를 해서 키의 값이 중복하게 저장되지 않도록 해줘야한다.
		
		System.out.println("총 Map.Entry 수 : " + map.size()); // 2 출력
		
		// 사용자정의 클래스를 key값의 타입으로 사용하게되면
		// 그 사용자정의 클래스에 hashCode(), equals() 메서드들을 모두
		// 재정의해줘야 값이 중복되지 않게 Map에 저장할 수 있게 된다.
		
	}
}

