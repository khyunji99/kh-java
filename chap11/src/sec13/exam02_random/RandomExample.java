package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 로또번호 자동으로 랜덤하게 뽑는 상황
		
		int[] selectNum = new int[6];
		Random random = new Random(5);
		// seed값 즉, 종자값을 5로 설정한 것
		// 종자값을 설정하면 계속 실행을 해도 다른 랜덤값으로 변경되지 않고
		// 한번 정해진 랜덤값이 계속 똑같이 나오게 된다.
		
		System.out.print("선택된 번호: ");
		for(int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			System.out.print(selectNum[i] + " ");
		}
		// random객체의 nextInt() 는 int 타입의 랜덤값을 리턴해주는 메서드이다.
		// 그 메서드의 매개변수로 오는 종자값을 넣으면
		// 0부터 종자값까지의 정수값인 랜덤값이 리턴된다. 
		// 0 <= random.nextInt(45) < 45
		// 1 <= random.nextInt(45) + 1 < 46
		
		System.out.println();
		
		
		// 로또 당첨번호 만들기
		
		int[] winningNum = new int[6];
		random = new Random(30);
		System.out.print("당첨번호: ");
		for(int i = 0; i < 6; i++) {
			winningNum[i] = random.nextInt(45) + 1;
			System.out.print(winningNum[i] + " ");
		}
		
		System.out.println();
		
		// 로또 당첨 여부
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		boolean result = Arrays.equals(selectNum, winningNum);
		// 각각의 배열에 들어있는 값 비교
		System.out.print("로또 당첨 여부: ");
		
		if(result) {
			System.out.println("로또 1등에 당첨되셨습니다!!!!");
		} else {
			System.out.println("다음 기회를 노리세요.");
		}
	}
}
