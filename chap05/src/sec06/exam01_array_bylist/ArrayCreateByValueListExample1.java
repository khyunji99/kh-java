package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// 1. 배열 선언과 동시에 값 초기화하는 경우 
		// 배열값 지정이 Array constants로 지정하는 경우, 초기값 설정으로만 가능
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		/*
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		*/
		System.out.println("총합 : " + sum);		
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}