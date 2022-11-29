package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// 하나의 Main Thread가 하나의 main() 메서드를 실행한다.
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 
		for(int i=0; i<5; i++) {		
			toolkit.beep(); // 소리가 beep 소리가 나게 만드는 구문
			try { Thread.sleep(500); } catch(Exception e) {}
		} // 소리 출력

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		} // 소리가 끝나면 띵 출력되게 한다.
	}
}
