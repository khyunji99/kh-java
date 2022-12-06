package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		// ����Ʈ ����� ���� �Է½�Ʈ�� ����
		InputStream is = new FileInputStream("C:/dev/test.txt");
		// FileInputStream �� ������ �о�� �� ����ϴ� ����Ʈ ��� ���� �Է½�Ʈ���̴�.
		int readByte;
		
		while(true) {
			readByte = is.read();
			// read() : �Ű������� ���� ���
			// .read()�� FileInputStream���κ��� �����͸� 1����Ʈ�� �о���� �޼���
			// readByte���� �о�� �����Ͱ� ����ǰ� �ȴ�.
			System.out.println(readByte);
			
			if(readByte == -1) { // readByte == -1�̶�� �̾߱�� ���̻� �о�� �����Ͱ� ���� ���
				break;
			}
			System.out.println((char)readByte);
			// readByte�� 4byte�ε� char�� 2byte�̴ϱ� ��������ȯ
		}
		is.close();
	}
}
