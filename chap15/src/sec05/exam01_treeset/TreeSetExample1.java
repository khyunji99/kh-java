package sec05.exam01_treeset;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ����: " + score);
		// first() �� Integer Ÿ���� ��ȯ�Ѵ�.
		// ó���� �ִ°� ���� ���� ������ ������ TreeSet�� ����Ʈ�� �����̱� ������
		// ������ �� �����̴�.
		
		
		score = scores.last();
		System.out.println("���� ���� ����: " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ����: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ����: " + score + "\n");		
		
		score = scores.floor(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			// pollFirst() : ù��°�Ÿ� �ϳ��� ���� �������� �޼���
			System.out.println(score + "(���� ��ü ��: " + scores.size() + ")");
		}
	}
}
