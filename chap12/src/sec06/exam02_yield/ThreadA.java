package sec06.exam02_yield;

public class ThreadA extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			} else {
				Thread.yield();  // ThreadB 작업 내용 위주로 실행된다.
			}
		}
		System.out.println("ThreadA 종료");
	}
}

