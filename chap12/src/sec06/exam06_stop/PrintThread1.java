package sec06.exam06_stop;

public class PrintThread1 extends Thread {
	private boolean stop; // 디폴트값 : false -> true
	
	public void setStop(boolean stop) {
	  this.stop = stop;
	}
	
	public void run() {	
		while(!stop) {  // (stop flag) stop 플래그 방법 
			System.out.println("실행 중");
		}	
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

