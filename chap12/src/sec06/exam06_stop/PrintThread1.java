package sec06.exam06_stop;

public class PrintThread1 extends Thread {
	private boolean stop; // ����Ʈ�� : false -> true
	
	public void setStop(boolean stop) {
	  this.stop = stop;
	}
	
	public void run() {	
		while(!stop) {  // (stop flag) stop �÷��� ��� 
			System.out.println("���� ��");
		}	
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

