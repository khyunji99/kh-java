package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		// Map map = new HashMap(); <-- 이거는 키도 값도 다 Object타입으로 들어가는 것
		// 이렇게 적으면 안된다..?
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("민정장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Map Entry 수 : " + map.size()); // 3 출력
		// key 값이 "홍길동"으로 중복되어 마지막에 넣은 "홍길동"인 객체만 들어가고
		// 그 전 객체는 저장이 안된다.
		
		// 객체 찾기
		System.out.println("홍길동 : " + map.get("홍길동")); // 95 출력
		// get() : key값이 "홍길동인" value값을 찾아 리턴해줌
		
		System.out.println();
		// 객체를 하나씩 처리하는 방법 : keySet()
		// keySet() : key값 객체들을 Set으로 만들어버리는 메서드
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Map.Entry 개수 : " + map.size());
		System.out.println();
		
		/** 객체를 하나씩 처리하는 다른 방법 : Map.EntrySet() **/
		// key값도 value값도 Map 그 전체를 Set으로 만들어버리는 메서드
		// Map은 key값은 String 타입으로, value값은 Integer 타입이므로
		// Map.Entry<String, Integer> 이렇게 적은 것이다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		System.out.println();
		System.out.println("--- 객체 전체 삭제 후 Entry 개수 ---");
		// 전체 객체 다 삭제
		map.clear();
		System.out.println("총 Map.Entry 개수 : " + map.size());
		
	}
}