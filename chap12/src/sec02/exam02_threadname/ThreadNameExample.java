package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		// Thread 클래스를 상속받은 ThreadA 하위 클래스
		// 이름 지정된 메서드 구현되어 있음 --> 내가 원하는 이름으로 출력됨 
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		// Thread 클래스를 상속받은 ThreadB 하위 클래스
		// 이름 지정하는 메서드 구현 X --> 자동으로 지정된 이름으로 출력됨
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
