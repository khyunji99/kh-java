package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	// Main Thread�� main() �޼��带 ����
	public static void main(String[] args) {
		/** ���̶�� �޼����� �� �Ҹ��� ���ÿ� ��µǰ� ������. **/
		// 1. Thread Ŭ�����κ��� ���� Thread ��ü�� ����
		
		// how1 : Runnable ���� ��ü
		// �� ����� ������(?) : BeepTask()�� ����� �ѹ��ۿ� ��� ���� --> ���������� ���� �ʴ�.
		
		/*Runnabl beepTask = new BeepTask();
		
		// �۾� ������ ���� (Multi-Thread ȯ��)
		Thread thread = new Thread(beepTask); // Main �����忡�� �۾� ������ ����
		*/
		
		// how2 : �͸� ���� ��ü <-- how1 ����� ������ ����
		/*Thread thread = new Thread(new Runnable() {
			// Runnable �������̽��� ������ �ִ� �޼��� ������ ����� ��
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		// how3 : ���ٽ� (�͸�����ü�� �����ϰ� ǥ���� ��)
		Thread thread = new Thread(() -> {
			// () �� �ǹ��ϴ� ���� how2������� ��������
			// new Runnable() { @Override public void run() .. }
			// �̰Ͱ� ���� ���̴�.
			// -> �ڿ��� �������ؾ� �ϴ� �޼����� �����θ� �����ָ� �ȴ�.
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
		
		thread.start(); // <- �۾� �����尡 ������ (�۾� �����忡�� ����)
		
		for(int i=0; i<5; i++) { // <-- ���� �����尡 ������ (���� �����忡�� ����)
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
