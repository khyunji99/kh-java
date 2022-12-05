package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// ����Ʈ ����� ���� �Է½�Ʈ�� ����
		InputStream is = new FileInputStream("C:/dev/test.txt");
		int readByte;
		
		while(true) {
			readByte = is.read();
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
