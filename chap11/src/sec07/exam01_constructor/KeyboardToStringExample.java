package sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100]; // �迭 ������ Ȯ���� ��
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		// Ű���忡�� ���� �о� �� ��ü�� bytes �迭�� �����ϰ�
		// �о �迭�� ����� ���� ������ readByteNo�� �����Ѵ�.
		// �׷��� readByteNo�� bytes �迭�� ����� �� �迭 ������ ������.

		System.out.println("readByteNo = " + readByteNo); // readByteNo �� ������ ���� + 2 �� ���� ���´�.
		                                                  
		
		String str = new String(bytes, 0, readByteNo-2); // -2 : �� �������� �ִ� ����Ű �ΰ� ���ֱ�
		System.out.println(str);
	}
}
