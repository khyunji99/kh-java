package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// �ϳ��� Main Thread�� �ϳ��� main() �޼��带 �����Ѵ�.
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 
		for(int i=0; i<5; i++) {		
			toolkit.beep(); // �Ҹ��� beep �Ҹ��� ���� ����� ����
			try { Thread.sleep(500); } catch(Exception e) {}
		} // �Ҹ� ���

		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		} // �Ҹ��� ������ �� ��µǰ� �Ѵ�.
	}
}
