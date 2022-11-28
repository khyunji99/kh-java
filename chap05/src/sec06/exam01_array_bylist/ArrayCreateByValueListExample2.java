package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		// 2. 배열 선언 후 값 지정(초기화)하는 경우
		int[] scores; // 배열 선언
		scores = new int[] { 83, 90, 87 };
		// 배열 값 지정(초기화)
		// new 데이터형[];
		// scores = {83, 90, 87}; <-- 배열 선언 후 값을 초기화할 때 이렇게 지정할 수 없다.
		
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);	
		
		int sum2 = add( new int[] { 83, 90, 87 } );
//		int sum2 = add( { 83, 90, 87 } );  // 이렇게 배열 값 지정 못함
		System.out.println("총합 : " + sum2);	
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}