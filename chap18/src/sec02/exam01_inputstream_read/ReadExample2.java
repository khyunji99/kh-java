package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/dev/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		
		while(true) {
			readByteNo = is.read(readBytes); // 3bytes�� �����͸� �о�´�. ��, �迭�� ũ�⸸ŭ �о���� ��
			// read(readBytes) : �Ű����� �ϳ��� ���
			// �о�� �����ʹ� readBytes �迭�� ����ǰ� ���� �������� ������ readByteNo�� �������.
			System.out.println(readByteNo);
			if(readByteNo == -1)
				break;
			
			data += new String(readBytes, 0, readByteNo);
			// readBytes �迭�� �ε��� 0������ readByteNo�� ������ŭ..
		}
		System.out.println(data.toString());
		System.out.println(data); // ���� data.toString() ����ѰͰ� �����ϰ� ��µ�. "C:/dev/test.txt"
		is.close();
	}
}
