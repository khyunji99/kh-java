package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test3.txt");
		byte[] data = "ABC".getBytes();
		
		os.write(data, 1, 2);
		// write(data, 1, 2) : �Ű����� 2�� �̻��� ���
		// write(data, 1, 2) : data �迭���� 1�� �ε������� 2���� ������ �� �����ͼ� ����
		os.flush();
		os.close();
	}
}
