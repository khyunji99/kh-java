package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01_Answer {

	public static void main(String[] args) {
		int n;
		// Set : 입력되는 값을 순서 상관없이 저장한다. 
		Set s = new HashSet();
		// TreeSet : 입력되는 값을 정렬하여 값을 저장한다.
		// TreeSet은 값이 들어갈때 값이 비교되면서 이진트리 모양으로
		// 값이 저장된다. 그러고 값을 꺼낼때
		// 이진트리에서 가장 왼쪽에 있는 작은것부터 꺼내면서 정렬되도록 값을 꺼낸다.
		TreeSet ts = new TreeSet();
		
		Random r = new Random();
		// 0.0 <= Math.random() : 임의의 실수 < 1.0
		
		while(s.size() < 6) {
			n = r.nextInt(45)+1; // 1 ~ 45 사이의 임의의 정수값
			//nextInt() <- int 타입의 난수를 리턴
			
			s.add(n);  // set에서 중복을 허용하지 않는다.
		}
		ts.addAll(s); // s 를 정렬시켜주는 메서드,,?
		System.out.println(ts);

	}
}
