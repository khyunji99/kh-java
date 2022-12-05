package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// �������̽� = ���� ��ü;
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");   // �ߺ��� �ڷῡ overwrite�Ѵ�.
		set.add("myBatis");
		
		int size = set.size();
		System.out.println("�� ��ü �� : " + size); // 4 ��� <-- �ߺ��Ǵ� ���� �ѹ��� ��
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // ���� ���������� �� ��ȯ����
			String element = iterator.next();
			System.out.println(element);
			// Java
			// myBatis
			// JDBC
			// Servlet/JSP
			// ���� ���� ��µ�
		}
		
		set.remove("JDBC");
		set.remove("myBatis");
		
		System.out.println("�� ��ü ���� : " + size); // 2 ���
		
		for(String element : set) {
			System.out.println(element);
		}
		
		// set.clear() �޼��� : set�� ��� ���� ����
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�迭 ��� ����");
		}
		
	}
}

