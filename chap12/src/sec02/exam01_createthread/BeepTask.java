package sec02.exam01_createthread;

import java.awt.Toolkit;

// 구현 클래스
public class BeepTask implements Runnable {
	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { 
				Thread.sleep(500); // Thread.sleep(500)은 현재 스레드를 500ms 정지한다.
			} catch(Exception e) {
				
			}
		}
	}
}

