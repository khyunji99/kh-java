package sec13.exam01_math;

public class MathExample {
	public static void main(String[] args) {
		// Math.abs();  // 절댓값 리턴
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
		// Math.ceil();  // 소수점 올린 값 리턴
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		
		// Math.floor();  // 소수점 버린 값 리턴
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);
		
		// Math.max();  // 실수형의 최댓값 리턴
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7=" + v7);
		System.out.println("v8=" + v8);
		
		// Math.min();  // 실수형의 최솟값 리턴
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9=" + v9);
		System.out.println("v10=" + v10);
		
		// 0.0 <= Math.random(); < 1.0  // 0보다 크거나 같고 1보다 작은 실수의 랜덤값 리턴
		double v11 = Math.random();
		System.out.println("v11=" + v11);
		
		// Math.rint();  // 가까운 정수의 실수값 리턴
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12=" + v12);
		System.out.println("v13=" + v13);
		
		// Math.round();  // 소수점 반올림한 값 리턴
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14=" + v14);
		System.out.println("v15=" + v15);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16=" + v16);
	}
}
