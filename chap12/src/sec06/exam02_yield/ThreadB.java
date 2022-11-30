package sec06.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();  // ThreadA 작업 내용 위주로 실행된다.
			} //다른 스레드에게 실행 양보(yield())
			  // 실행 중 우선순위가 동일한 다른 스레드에게 실행 양보후 실행 대기 상태가 됨
		}
		System.out.println("ThreadB 종료");
	}
}

