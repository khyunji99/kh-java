package sec05.exam01_state;

public class ThreadStateExample {
	public static void main(String[] args) {
		// 작업 스레드 생성
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
