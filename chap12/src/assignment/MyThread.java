package assignment;

public class MyThread extends Thread {
	@Override
	public void run() {
		// Thread가 시작되면 실행되는 문장
		for(int i = 0; i < 500; i++) {
			System.out.print("S");
		}
	}
}
