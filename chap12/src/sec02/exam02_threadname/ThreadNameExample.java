package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName());
		
		// Thread Ŭ������ ��ӹ��� ThreadA ���� Ŭ����
		// �̸� ������ �޼��� �����Ǿ� ���� --> ���� ���ϴ� �̸����� ��µ� 
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�: " + threadA.getName());
		threadA.start();
		
		// Thread Ŭ������ ��ӹ��� ThreadB ���� Ŭ����
		// �̸� �����ϴ� �޼��� ���� X --> �ڵ����� ������ �̸����� ��µ�
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�: " + threadB.getName());
		threadB.start();
	}
}
