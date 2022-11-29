package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// �ζǹ�ȣ �ڵ����� �����ϰ� �̴� ��Ȳ
		
		int[] selectNum = new int[6];
		Random random = new Random(5);
		// seed�� ��, ���ڰ��� 5�� ������ ��
		// ���ڰ��� �����ϸ� ��� ������ �ص� �ٸ� ���������� ������� �ʰ�
		// �ѹ� ������ �������� ��� �Ȱ��� ������ �ȴ�.
		
		System.out.print("���õ� ��ȣ: ");
		for(int i = 0; i < 6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			System.out.print(selectNum[i] + " ");
		}
		// random��ü�� nextInt() �� int Ÿ���� �������� �������ִ� �޼����̴�.
		// �� �޼����� �Ű������� ���� ���ڰ��� ������
		// 0���� ���ڰ������� �������� �������� ���ϵȴ�. 
		// 0 <= random.nextInt(45) < 45
		// 1 <= random.nextInt(45) + 1 < 46
		
		System.out.println();
		
		
		// �ζ� ��÷��ȣ �����
		
		int[] winningNum = new int[6];
		random = new Random(30);
		System.out.print("��÷��ȣ: ");
		for(int i = 0; i < 6; i++) {
			winningNum[i] = random.nextInt(45) + 1;
			System.out.print(winningNum[i] + " ");
		}
		
		System.out.println();
		
		// �ζ� ��÷ ����
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		boolean result = Arrays.equals(selectNum, winningNum);
		// ������ �迭�� ����ִ� �� ��
		System.out.print("�ζ� ��÷ ����: ");
		
		if(result) {
			System.out.println("�ζ� 1� ��÷�Ǽ̽��ϴ�!!!!");
		} else {
			System.out.println("���� ��ȸ�� �븮����.");
		}
	}
}
