package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 만드는 방법 1
		// ArrayList 구현클래스로 List 생성
		// List<> list = new ArrayList<>();
		// < > 에는 list 배열의 요소로 들어가는 값의 데이타타입을 적는다.
		List<String> list = new ArrayList<String>();
		// 인터페이스 = ArrayList 구현객체
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase"); 
		// list.add(인덱스, "문자열");
		// 지정한 인덱스에 문자열 넣는 것을 의미
		// 그러면 원래 그 인덱스에 있던 값은 다음 인덱스로 옮겨진다.
		list.add("myBatis");
		// ( ) 안에 문자열이 들어가는건 <String> 제네릭 타입으로 지정해서
		// String 타입의 값이 배열에, ( )안에 들어가게 되는 것이다.
		
		
		int size = list.size();
		System.out.println("배열의 총 객체 수 : " + size);
		System.out.println();
		
		//list.get(int index) : 인덱스에 해당하는 값 리턴해주는 메서드
		String skill = list.get(2);
		// System.out.println(skill); 아래에 toString() 으로 출력하는 것과 같다.
		System.out.println("2번 인덱스의 값: " + skill.toString());
		
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		System.out.println();
		
		
		// 배열 요소 지워보기
		// list.remove(int index);
		// 인덱스에 해당하는 배열의 요소값 지우기
		// 그러면 지워진 인덱스 다음 인덱스에 있는 값들이
		// 저절로 하나씩 앞으로 당겨져 온다.
		list.remove(2);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);

		list.remove("myBatis");
		System.out.println(list);

		System.out.println();
		
		// 이렇게 지우고 나면 0, 1번 인덱스의 배열 요소 값만 남게된다.
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
		System.out.println("--- 향상된 for문으로 남은 인덱스의 배열 값 출력 ---");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}
}

