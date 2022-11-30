package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();

		try {
			Thread.sleep(3000); // 3�ʵ����� �ǹ�
		} catch (InterruptedException e) {
		}
		threadA.work = false;  // threadA�� �纸 -> threadB��(���ַ�) ����� 

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true;  // threadA�� �纸���� -> round-robin ������� �����ư��� �����

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.stop = true;
		threadB.stop = true;
	}
}
