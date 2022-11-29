package assignment;

public class MyRunMain {

	public static void main(String[] args) {
		
		MyRun mr1 = new MyRun();    // 1. Runnable 인터페이스의 MyRun 구현 객체 생성
		Thread t1 = new Thread(mr1); // 작업스레드 생성
		
		Thread t2 = new MyThread(); // (작업스레드 생성)2. Thread를 상속받는 하위 클래스 객체 생성
		t1.start(); // 작업스레드 실행
		t2.start(); // 작업스레드 실행
		
		Thread main = Thread.currentThread();
		main.setPriority(10);
		
		t1.setPriority(1);
		t2.setPriority(5);
		// 메인 스레드가 실행
		for (int i = 0; i < 500; i++) {
			System.out.print("M");
		}
		// 실행할때마다 출력값 달라진다.
	}

}
