package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1 : thread.interrupt()를 실행시켜
		// 스레드 상태를 일시정지 상태로 변경하여 예외(Exception)를 발생시켜 실행 종료시킴
		/*try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); // 얘가 없으면 무한 실행한다.
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2 : runnable(실행대기)과 run(실행) 상태인 경우,
		// Thread.interrupt()를 실행시켜도 예외가 발생하지 않기때문에
		// Thread.interrupted()를 이용해서 -> while문 탈출 -> 실행 종료시킴
		while(true) {
			System.out.println("실행 중");
			/*
			if(Thread.interrupted()) { 
				break;
			}
			*/
		}
		
		//System.out.println("자원 정리");
		//System.out.println("실행 종료");
	}
}

