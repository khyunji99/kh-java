package sec04.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		// FileWriter : ���ڱ���� ���� ��� ��Ʈ��
		// FileWriter(file, true) : ������ ���� ���� ���� �����͸� �߰��ϴ� ���
		
		fw.write("FileWriter�� �ѱ۷ε� " + "\r\n"); // "\r\n" : �ٹٲ�
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�. " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
		
	}
}

