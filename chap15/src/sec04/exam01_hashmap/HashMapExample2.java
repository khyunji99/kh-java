package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// map�� Ű, �� �ֱ�
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		// �޼��� ������ ���� ���¿����� ���� Ű���� �������� �ʴٰ� ����.
		// hashCode(), equals()�޼������ �����Ǹ� �ؼ� Ű�� ���� �ߺ��ϰ� ������� �ʵ��� ������Ѵ�.
		
		System.out.println("�� Map.Entry �� : " + map.size()); // 2 ���
		
		// ��������� Ŭ������ key���� Ÿ������ ����ϰԵǸ�
		// �� ��������� Ŭ������ hashCode(), equals() �޼������ ���
		// ����������� ���� �ߺ����� �ʰ� Map�� ������ �� �ְ� �ȴ�.
		
	}
}

