package sec04.exam01_unsynchronized;

public class Calculator {
	private int memory; // �����Ǵ� �ʵ�

	public int getMemory() {
		return memory;
	}
	// ����ȭ �޼���
	// �ϳ��� �����常 ������ �� �ֵ��� ������ִ� �� => ����ȭ �޼��� �� ����ȭ �� (synchronized)
	// �̰� ����ϰ� �Ǹ� ���� �ð��� �����.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2���� �ǹ�
		} catch(InterruptedException e) {
			
		}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

