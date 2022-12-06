package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/dev/test.txt");
		int readData;
		
		while( true ) {
			readData = reader.read();
			// read() : �Ű����� ���� ���
			// read() : �Է� ��Ʈ�����κ��� �Ѱ��� ����(2byte��)�� �а� ����
			if(readData == -1) // readData == -1 �̶�� ���� ���̻� �о� �� �����Ͱ� ���ٴ� �̾߱�
				break;
			
			System.out.print((char)readData);
		}
		reader.close();
		// close() : ����� �ý��� �ڿ��� �ݳ��ϰ� �Է� ��Ʈ���� �ݴ´�.
	}
}
