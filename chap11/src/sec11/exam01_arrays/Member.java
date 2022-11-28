package sec11.exam01_arrays;

public class Member implements Comparable<Member>{
	// 필드
	String name;
	
	// 생성자
//	Member(){}
	
	Member(String name){
		this.name = name;
	}

	
	// 메서드
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name); // 알파벳 순으로 비교..?
	}
}
