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
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		System.out.println();
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		
		Member[] members = {m1, m2, m3};
		// ����� ������ Ŭ������ Arrays.sort() �޼��带 ����ϱ� ����
		// Comparable �������̽��� ������ ���� Ŭ������ ��������� �Ѵ�.
		
		Arrays.sort(members);
		// Comparable �������̽� �����ϴ� ����Ŭ������ �����
		// �̸� ���ϴ� compareTo()�޼��带 ������ �����
		// Member cannot be cast to class java.lang.Comparable ������ �ȳ���. 
		
		// String Ŭ������ ����Ŭ�����̴�..?
		
		for(int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
		
	}
}
/*
 * Arrays.sort(�迭) : �迭�� �׸���� ������������ �������ִ� �޼���
 *   - �⺻ Ÿ���̰ų� String �迭�� �ڵ����� ���ĵȴ�.
 *   - ����� ���� Ŭ���� �迭�� Comparable �������̽��� �����ؾ߸� ������ �����ϴ�.
 */