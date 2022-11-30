package sec07.exam01_daemon;

// 1초 단위로 SaveThread 실행
public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
