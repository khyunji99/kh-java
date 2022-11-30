package sec06.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();

		try {
			Thread.sleep(3000); // 3초동안을 의미
		} catch (InterruptedException e) {
		}
		threadA.work = false;  // threadA가 양보 -> threadB만(위주로) 실행됨 

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.work = true;  // threadA가 양보안함 -> round-robin 방식으로 번갈아가며 실행됨

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadA.stop = true;
		threadB.stop = true;
	}
}
