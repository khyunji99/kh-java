package sec05.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception {	
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		// ����Ʈ����� File ��� ��Ʈ��
		Writer writer = new OutputStreamWriter(fos);
		// ���� ��Ʈ�� OutputStreamWriter ����ؼ�
		// ���� ��Ʈ������ ����Ʈ ��Ʈ������ ��ȯ
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
	}
}

