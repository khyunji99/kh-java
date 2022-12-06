package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/dev/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes, 2, 3);
		// read(readBytes, 2, 3) : �Ű����� �ΰ� �̻��� ���
		// readBytes �迭�� 2�� �ε������� 3���� ������ �о�ͼ� �־���
		// ��, readBytes �迭�� 3���� �����͸� �־��ִµ� 2�� �ε������� �ִ´�.
		// readByteNo�� �о�� �������� ���� �̹Ƿ� 3�̴�.
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
