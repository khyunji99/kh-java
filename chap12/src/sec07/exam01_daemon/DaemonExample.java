package sec07.exam01_daemon;

public class DaemonExample {
	// ��(main) ������
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread(); // <- �۾������� ����
		autoSaveThread.setDaemon(true); // <- �۾������带 ���󽺷���� ����
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("���� ������ ����");
	}
}
// ���� �����尡 ������ �۾� �����尡 �ȳ����� �ϳ��� �����ִٸ� �� �۾������尡
// ���������� ������ �ƴϴ� (�۾� ������� ��� ����ȴ�).
// (--> ���� ������� �۾� ������� ����)
// ���󽺷���� ���ν������ �����Ǿ ���� �����尡 �����ԵǸ� �ȳ��� �۾������尡
// �־ �׳� ������ �ع�����.
// ���� ������ �۾������尡 ���󽺷���� ����Ǿ ���ν����尡 ������ ���󽺷����
// ����� �۾������尡 ������ �ʾҾ �׳� ������.