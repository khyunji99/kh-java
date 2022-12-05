package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			if(maxScore < map.get(key)) {
				maxScore = map.get(key);
			}
		}
		
		
		for(int score : map.values()) {
			Integer value = map.get(keyIterator);
			totalScore += score;
		}
		
		
		System.out.println("�������: " + totalScore / map.size());
		System.out.println("�ְ�����: " + maxScore);
		
		for(String key : keySet) {
			if(maxScore == map.get(key))
				System.out.println("�ְ������� ���� ���̵�: " + key);
		}

	}

}
