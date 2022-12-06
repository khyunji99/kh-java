package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test2.txt");
		byte[] data = "ABC".getBytes();
		
		os.write(data);
		// write(byte[] b) : �Ű����� ����Ʈ �迭�� �ϳ��� ���
		// byte[] �� OutputStream���� �Ѳ����� �����Ѵ�.
		os.flush();
		os.close();
	}
}
