package sec13.exam01_math;

public class MathRandomExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// 0.0 <= Math.random() < 1.0
		// 0 <= (int)(Math.random();*6) < 6
		// 1 <= (int)(Math.random(); * 6) + 1 < 7
		
		System.out.println("num = " + num);
		// num : 1 ~ 6까지의 정수형 랜덤값
	}
}