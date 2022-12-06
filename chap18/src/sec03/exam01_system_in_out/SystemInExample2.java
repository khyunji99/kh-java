package sec03.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {			
		InputStream is = System.in;
		// InputStream : ����Ʈ ����� �Է� ��Ʈ��
		byte[] datas = new byte[100];
		
		System.out.print("�̸�: ");
		int nameBytes = is.read(datas);
		// datas �迭�� ���� �����͸� �����ϰ� �о�� �������� ������ nameBytes�� ����
		String name = new String(datas, 0, nameBytes-2);
		// nameBytes�������� -2�� �ϴ� ����
		// ���ڿ��� �� �������� �ΰ��� ����Ű������ �װ� �����Ѱ� ��¥ ���� ���ϰ��� �ϴ� �����̴�.
		
		System.out.print("�ϰ� ���� ��: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�ϰ� ���� ��: " + comment);
		
	}
}

