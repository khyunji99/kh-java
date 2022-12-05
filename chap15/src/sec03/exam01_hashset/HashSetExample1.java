package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// 인터페이스 = 구현 객체;
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");   // 중복된 자료에 overwrite한다.
		set.add("myBatis");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size); // 4 출력 <-- 중복되는 값은 한번만 들어감
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // 값이 없을때까지 값 반환해줌
			String element = iterator.next();
			System.out.println(element);
			// Java
			// myBatis
			// JDBC
			// Servlet/JSP
			// 위와 같이 출력됨
		}
		
		set.remove("JDBC");
		set.remove("myBatis");
		
		System.out.println("총 객체 개수 : " + size); // 2 출력
		
		for(String element : set) {
			System.out.println(element);
		}
		
		// set.clear() 메서드 : set의 모든 값들 삭제
		set.clear();
		if(set.isEmpty()) {
			System.out.println("배열 비어 있음");
		}
		
	}
}

