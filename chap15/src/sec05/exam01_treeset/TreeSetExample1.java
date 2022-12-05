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
		System.out.println("가장 낮은 점수: " + score);
		// first() 는 Integer 타입을 반환한다.
		// 처음에 있는게 가장 낮은 점수인 이유는 TreeSet이 이진트리 구조이기 때문에
		// 정렬이 된 상태이다.
		
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");		
		
		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			// pollFirst() : 첫번째거를 하나씩 값을 꺼내오는 메서드
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}
