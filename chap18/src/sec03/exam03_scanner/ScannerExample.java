package sec03.exam03_scanner;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// �ֿܼ��� ���� �����͸� �Ű������� �޴°�,,?
		
		System.out.print("���ڿ� �Է� > ");
		String inputString = scanner.nextLine();
		// .nextLine() : String Ÿ�� ��ȯ
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("���� �Է� > ");
		int inputInt = scanner.nextInt();
		// .nextInt() : int Ÿ�� ��ȯ
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("�Ǽ� �Է� > ");
		double inputDouble = scanner.nextDouble();
		// .nextDouble() : double Ÿ�� ��ȯ
		System.out.println(inputDouble);
		
		
		
		
	}
}
