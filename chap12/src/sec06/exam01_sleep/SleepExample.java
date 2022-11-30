package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
// 주어진 시간동안 일시 정지(sleep())
// 얼마 동안 일시 정지 상태로 있을 것인지 밀리 세컨드(1/1000) 단위로 지정