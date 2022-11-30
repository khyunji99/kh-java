package sec06.exam06_stop;

public class StopFlagExample {
	public static void main(String[] args)  {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		// printThread.stop(true); --> 안정적이지 못한 방법 --> 비추
		printThread.setStop(true);
	}
}

