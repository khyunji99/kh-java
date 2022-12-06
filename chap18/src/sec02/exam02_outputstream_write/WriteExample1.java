package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test1.txt");
		
		byte[] data = "ABC".getBytes();
		// .getBytes() : String ���ڿ��� 1����Ʈ�� �����ͼ� ����Ʈ �迭�� ����
		// .getBytes() : String�� byte[] �� �����.
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
			// write(int) : �Ű����� int������ �ϳ��� ���
			// .write(byte[] b) : ��� ��Ʈ���� �Ű������� �־��� ����Ʈ �迭 b�� ��� ����Ʈ�� ������.
			// ��, �� ����Ʈ�� OutputStream���� �����Ѵ�.
		}
		os.flush();
		// flush() : ���ۿ� �ܷ��ϴ� �� �������� �� �ִ� ��� ����Ʈ�� ����Ѵ�.
		os.close();
	}
}
