package sec06.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1 : thread.interrupt()�� �������
		// ������ ���¸� �Ͻ����� ���·� �����Ͽ� ����(Exception)�� �߻����� ���� �����Ŵ
		/*try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1); // �갡 ������ ���� �����Ѵ�.
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2 : runnable(������)�� run(����) ������ ���,
		// Thread.interrupt()�� ������ѵ� ���ܰ� �߻����� �ʱ⶧����
		// Thread.interrupted()�� �̿��ؼ� -> while�� Ż�� -> ���� �����Ŵ
		while(true) {
			System.out.println("���� ��");
			/*
			if(Thread.interrupted()) { 
				break;
			}
			*/
		}
		
		//System.out.println("�ڿ� ����");
		//System.out.println("���� ����");
	}
}

