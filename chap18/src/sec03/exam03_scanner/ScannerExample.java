package sec03.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 콘솔에서 받은 데이터를 매개변수로 받는것,,?
		
		System.out.print("문자열 입력 > ");
		String inputString = scanner.nextLine();
		// .nextLine() : String 타입 반환
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력 > ");
		int inputInt = scanner.nextInt();
		// .nextInt() : int 타입 반환
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("실수 입력 > ");
		double inputDouble = scanner.nextDouble();
		// .nextDouble() : double 타입 반환
		System.out.println(inputDouble);
		
		
		
		
	}
}
