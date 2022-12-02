package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, String.valueOf(i));
			// String.valueOf()
			// int 형인 i값을 넣어서 String형의 값으로 리턴해주는 메서드
			// 그냥 () 들어간 숫자값들이 그대로 ""문자열로 반환된다. 
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");
		// 4877300 ns 출력
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");
		// 1539900 ns 출력
	}
}
