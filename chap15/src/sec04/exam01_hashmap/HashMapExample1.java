package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map ��ü ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		// Map map = new HashMap(); <-- �̰Ŵ� Ű�� ���� �� ObjectŸ������ ���� ��
		// �̷��� ������ �ȵȴ�..?
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("�����屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Map Entry �� : " + map.size()); // 3 ���
		// key ���� "ȫ�浿"���� �ߺ��Ǿ� �������� ���� "ȫ�浿"�� ��ü�� ����
		// �� �� ��ü�� ������ �ȵȴ�.
		
		// ��ü ã��
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿")); // 95 ���
		// get() : key���� "ȫ�浿��" value���� ã�� ��������
		
		System.out.println();
		// ��ü�� �ϳ��� ó���ϴ� ��� : keySet()
		// keySet() : key�� ��ü���� Set���� ���������� �޼���
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Map.Entry ���� : " + map.size());
		System.out.println();
		
		/** ��ü�� �ϳ��� ó���ϴ� �ٸ� ��� : Map.EntrySet() **/
		// key���� value���� Map �� ��ü�� Set���� ���������� �޼���
		// Map�� key���� String Ÿ������, value���� Integer Ÿ���̹Ƿ�
		// Map.Entry<String, Integer> �̷��� ���� ���̴�.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		System.out.println();
		System.out.println("--- ��ü ��ü ���� �� Entry ���� ---");
		// ��ü ��ü �� ����
		map.clear();
		System.out.println("�� Map.Entry ���� : " + map.size());
		
	}
}