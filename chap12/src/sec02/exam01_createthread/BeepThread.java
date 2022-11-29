package sec02.exam01_createthread;

import java.awt.Toolkit;

// Thread의 하위 클래스 (Thread 클래스를 상속받는 클래스)
public class BeepThread extends Thread {
	@Override
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

