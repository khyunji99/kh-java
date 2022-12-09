package sec05.exam07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		// FileOutputStream : ����Ʈ����� ���� ��½�Ʈ��
		FileOutputStream fos = new FileOutputStream("C:/temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		// println() : 
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�.");
		
		// ����Ʈ����̶� ����Ʈ�� �����͸� �־���ϴµ� ������Ʈ�� PrintStream��
		// ����ؼ� �׿� ���� �޼��带 ��������� ���ڿ��� ����ְ� ���ڿ��� ����ϰ� �Ѵ�. 
		
		ps.flush();
		ps.close();
		fos.close();
		
	}
}
