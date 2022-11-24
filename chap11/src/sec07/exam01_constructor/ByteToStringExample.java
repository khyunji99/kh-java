package sec07.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		// 1 byte = 8 bits ( -128 ~ 127������ ���� ���� )
		
		String str1 = new String(bytes); // bytes �迭�� �Ű������� �޾� �迭�� ����ִ� ���鿡 �ش��ϴ� ���ڵ��� ��Ƽ� ������� ���ڿ��� str1������ �ֱ�
		System.out.println(str1);  // "Hello Java" �迭 �ȿ� ����ִ� ���� �ƽ�Ű�ڵ� ������ �� ���� �ش��ϴ� ���ڿ��� ������ش�.
		System.out.println(str1.toString());
		
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);  // Java ���
		
		String str3 = new String(bytes, 0, 5);
		System.out.println(str3);  // Hello ���
		
	}
}
