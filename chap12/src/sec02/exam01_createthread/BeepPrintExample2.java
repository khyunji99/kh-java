package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	// Main Thread가 main() 메서드를 실행
	public static void main(String[] args) {
		/** 띵이라는 메세지와 띵 소리가 동시에 출력되게 만들자. **/
		// 1. Thread 클래스로부터 직접 Thread 객체를 생성
		
		// how1 : Runnable 구현 객체
		// 이 방법의 문제점(?) : BeepTask()를 만들고 한번밖에 사용 안함 --> 유지보수가 좋지 않다.
		
		/*Runnabl beepTask = new BeepTask();
		
		// 작업 스레드 생성 (Multi-Thread 환경)
		Thread thread = new Thread(beepTask); // Main 스레드에서 작업 스레드 생성
		*/
		
		// how2 : 익명 구현 객체 <-- how1 방법의 문제점 보완
		/*Thread thread = new Thread(new Runnable() {
			// Runnable 인터페이스가 가지고 있는 메서드 재정의 해줘야 함
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		// how3 : 람다식 (익명구현객체를 간략하게 표현한 식)
		Thread thread = new Thread(() -> {
			// () 가 의미하는 것이 how2방법에서 같은것은
			// new Runnable() { @Override public void run() .. }
			// 이것과 같은 것이다.
			// -> 뒤에는 재정의해야 하는 메서드의 구현부를 적어주면 된다.
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
		
		thread.start(); // <- 작업 스레드가 실행함 (작업 스레드에서 실행)
		
		for(int i=0; i<5; i++) { // <-- 메인 스레드가 실행함 (메인 스레드에서 실행)
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
