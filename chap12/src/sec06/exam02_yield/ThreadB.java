package sec06.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();  // ThreadA �۾� ���� ���ַ� ����ȴ�.
			} //�ٸ� �����忡�� ���� �纸(yield())
			  // ���� �� �켱������ ������ �ٸ� �����忡�� ���� �纸�� ���� ��� ���°� ��
		}
		System.out.println("ThreadB ����");
	}
}

