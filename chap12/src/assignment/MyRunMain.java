package assignment;

public class MyRunMain {

	public static void main(String[] args) {
		
		MyRun mr1 = new MyRun();    // 1. Runnable �������̽��� MyRun ���� ��ü ����
		Thread t1 = new Thread(mr1); // �۾������� ����
		
		Thread t2 = new MyThread(); // (�۾������� ����)2. Thread�� ��ӹ޴� ���� Ŭ���� ��ü ����
		t1.start(); // �۾������� ����
		t2.start(); // �۾������� ����
		
		Thread main = Thread.currentThread();
		main.setPriority(10);
		
		t1.setPriority(1);
		t2.setPriority(5);
		// ���� �����尡 ����
		for (int i = 0; i < 500; i++) {
			System.out.print("M");
		}
		// �����Ҷ����� ��°� �޶�����.
	}

}
