package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1~100 ������ ��		
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0, inNum =0;
		
//		1���� 100������ ���ڸ� �Է��ϼ���.
//		�Էµ� ���� ran�� ������ 1���� ���ƽ��ϴٶ�� ����ϰ� ����
//		ran���� ũ�� ���� ���� �Է��ϼ���.
//		ran���� ������ ū���� �Է��ϼ���.
//		���⶧ ���� �ݺ�
		
		do {
			System.out.println("1���� 100���� ���ڸ� �Է��ϼ���.");
			inNum = sc.nextInt();
			if (inNum > ran )
				System.out.println("���� ���� �Է��ϼ���.");
			else if (inNum < ran)
				System.out.println("ū���� �Է��ϼ���.");
			cnt++;			
		} while (ran != inNum);
		
		System.out.println(cnt+"���� ���ƽ��ϴ�.");
		
		sc.close();

	}

}
