package assignment;

public class MyThread extends Thread {
	@Override
	public void run() {
		// Thread�� ���۵Ǹ� ����Ǵ� ����
		for(int i = 0; i < 500; i++) {
			System.out.print("S");
		}
	}
}
