package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 { // 멀티 태스킹
	public static void main(String[] args) {
		// 2. Thread 하위 클래스로부터 생성
		// how1 : Thread 클래스의 자식 클래스를 만들어서 자식 객체를 생성하여 이용
		// 이 방법의 단점 : 객체 하나 만들기 위해 클래스를 만들어줘야함 --> 유지보수 좋지않음
		// Thread thread = new BeepThread(); // 자동형변환: 부모형 <- 자식형
		
		// how2 : 익명 자식 객체 이용 <-- how1 방법의 단점 보완..?
		Thread thread = new Thread() {
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try {
						Thread.sleep(500); 
					} catch(Exception e) {
						
					}
				}
			}
		};
		
		
		thread.start();		
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

