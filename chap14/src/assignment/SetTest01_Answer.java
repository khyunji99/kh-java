package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01_Answer {

	public static void main(String[] args) {
		int n;
		// Set : �ԷµǴ� ���� ���� ������� �����Ѵ�. 
		Set s = new HashSet();
		// TreeSet : �ԷµǴ� ���� �����Ͽ� ���� �����Ѵ�.
		// TreeSet�� ���� ���� ���� �񱳵Ǹ鼭 ����Ʈ�� �������
		// ���� ����ȴ�. �׷��� ���� ������
		// ����Ʈ������ ���� ���ʿ� �ִ� �����ͺ��� �����鼭 ���ĵǵ��� ���� ������.
		TreeSet ts = new TreeSet();
		
		Random r = new Random();
		// 0.0 <= Math.random() : ������ �Ǽ� < 1.0
		
		while(s.size() < 6) {
			n = r.nextInt(45)+1; // 1 ~ 45 ������ ������ ������
			//nextInt() <- int Ÿ���� ������ ����
			
			s.add(n);  // set���� �ߺ��� ������� �ʴ´�.
		}
		ts.addAll(s); // s �� ���Ľ����ִ� �޼���,,?
		System.out.println(ts);

	}
}
