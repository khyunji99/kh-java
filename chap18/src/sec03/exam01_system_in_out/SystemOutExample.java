package sec03.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		// �ֿܼ� outputStream�� ����� ��
		// byte ������ ���´�!!
		
		for(byte b = 48; b < 58; b++) { // �ƽ�Ű�ڵ� 48���� 57������ ���� ���
			os.write(b);                // 0123456789 ���
		}
		os.write(10);
		// �����ǵ�(10)�� ����ϸ� ���� ������ �Ѿ��.
		
		for(byte b = 97; b < 123; b++) { // �ƽ�Ű�ڵ� 97���� 122������ ���� ���
			os.write(b);                 // abcdefghijklmnopqrstuvwxyz ���
		}
		os.write(10);
		
		String hangul = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
	}
}

