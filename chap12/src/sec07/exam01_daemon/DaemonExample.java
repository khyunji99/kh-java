package sec07.exam01_daemon;

public class DaemonExample {
	// 주(main) 스레드
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // <- 작업스레드 생성
		autoSaveThread.setDaemon(true); // <- 작업스레드를 데몬스레드로 변경
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}
// 메인 스레드가 끝나도 작업 스레드가 안끝난게 하나라도 남아있다면 그 작업스레드가
// 끝날때까지 끝난게 아니다 (작업 스레드는 계속 실행된다).
// (--> 메인 스레드와 작업 스레드는 별개)
// 데몬스레드는 메인스레드와 연관되어서 메인 스레드가 끝나게되면 안끝난 작업스레드가
// 있어도 그냥 끝나게 해버린다.
// 따라서 위에서 작업스레드가 데몬스레드로 변경되어서 메인스레드가 끝나면 데몬스레드로
// 변경된 작업스레드가 끝나지 않았어도 그냥 끝낸다.