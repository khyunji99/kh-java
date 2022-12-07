package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		
		// ������Ʈ�� BufferedInputStream ������� ���� ���
		FileInputStream fis1 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		// FileInputStream : ����Ʈ����� �Է½�Ʈ��
		// ���� �ý����� "���� ���"�� �������� �о�� �� �ִ�.
		// ���� ���(path) ex) C:\\dev\\workspace\\...\\forest.jpg
		// ��� ���(path) ex) forest.jpg
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� ��: " + (end-start) + "ms");
		fis1.close();
		
		
		// ������Ʈ�� BufferedInputStream ����� ���
		FileInputStream fis2 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("������� ��: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

