package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 { // ��Ƽ �½�ŷ
	public static void main(String[] args) {
		// 2. Thread ���� Ŭ�����κ��� ����
		// how1 : Thread Ŭ������ �ڽ� Ŭ������ ���� �ڽ� ��ü�� �����Ͽ� �̿�
		// �� ����� ���� : ��ü �ϳ� ����� ���� Ŭ������ ���������� --> �������� ��������
		// Thread thread = new BeepThread(); // �ڵ�����ȯ: �θ��� <- �ڽ���
		
		// how2 : �͸� �ڽ� ��ü �̿� <-- how1 ����� ���� ����..?
		Thread thread = new Thread() {
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try {
						Thread.sleep(500); 
					} catch(Exception e) {
						
					}
				}
			}
		};
		
		
		thread.start();		
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

