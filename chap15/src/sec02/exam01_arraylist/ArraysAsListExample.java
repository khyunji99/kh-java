package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		// List 만드는 방법 2
		// List<> list = Arrays.asList();
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		// List 타입으로 값을 리턴한다.
		
		
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3); // 박싱 되어서 들어간다..?
		// 배열 list 각 인덱스에 값이 들어가는 것이 아니라
		// Integer 객체가 들어가는 것이다.
		
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
