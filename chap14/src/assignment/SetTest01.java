package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		
		set.add(r.nextInt(45)+1); 
		set.add(r.nextInt(45)+1); 
		set.add(r.nextInt(45)+1); 
		set.add(r.nextInt(45)+1); 
		set.add(r.nextInt(45)+1); 
		
		int numCount = set.size();
		
		while(numCount != 6) {
			switch(numCount) {
			case 0 : 
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
			case 1:
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
			case 2:
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
			case 3:
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
			case 4:
				set.add(r.nextInt(45)+1);
				set.add(r.nextInt(45)+1);
			case 5:
				set.add(r.nextInt(45)+1);
			}
			
		}
		
		Iterator<Integer> iterator = set.iterator(); // 저장된 객체를 한번씩 가져오는 반복자 리턴
		while(iterator.hasNext()) {
			int rottoNum = iterator.next();
			System.out.println(" " + rottoNum);
		}
		
	}

}
