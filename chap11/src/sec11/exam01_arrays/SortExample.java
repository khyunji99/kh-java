package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		
		int[] scores = {99, 97, 98};
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		
		for ( int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		
		/*
		System.out.print("[ ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + ", ");
		}
		System.out.println(" ]");
		*/
		System.out.print("[");
		for (int i = 0; i < scores.length; i++) {
			if(i == 2)
				System.out.print(scores[i] + "]");
			else
				System.out.print(scores[i] + ", ");
		}
		
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		Member[] members = {m1, m2, m3};
		// 사용자 정의의 클래스는 Arrays.sort() 메서드를 사용하기 위해
		// Comparable 인터페이스를 구현한 구현 클래스로 정의해줘야 한다.
		
		Arrays.sort(members);
		// Comparable 인터페이스 구현하는 구현클래스로 만들고
		// 이름 비교하는 compareTo()메서드를 재정의 해줘야
		// Member cannot be cast to class java.lang.Comparable 오류가 안난다. 
		
		// String 클래스도 구현클래스이다..?
		
		for(int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
		
	}
}
/*
 * Arrays.sort(배열) : 배열의 항목들을 오름차순으로 정렬해주는 메서드
 *   - 기본 타입이거나 String 배열은 자동으로 정렬된다.
 *   - 사용자 정의 클래스 배열은 Comparable 인터페이스를 구현해야만 정렬이 가능하다.
 */