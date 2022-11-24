package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();  // str�� os�� MS-949 characterset���� ��ȯ�ؼ� ����..?
		System.out.println("bytes1.length : " + bytes1.length);
		
		String str1 = new String(bytes1); // byte�迭�� bytes1 ������ ������ ���ڿ��� ����ϱ�
		System.out.println(str1);    // "�ȳ��ϼ���" ��µ�
		
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");  // ���� ���ڵ�
			System.out.println("bytes2.length : " + bytes2.length);  // 10��
			String str2 = new String(bytes2, "EUC-KR");   // ���� ���ڵ�
			System.out.println("bytes2 -> String : " + str2);  // "�ȳ��ϼ���"
			
			System.out.println();
			System.out.println("--- �ȳ��ϼ��� UTF-8�� ���ڵ��ϰ� EUC-KR�� ���ڵ��ϱ� ----");
			byte[] bytes3 = str.getBytes("UTF-8");  // ���� ���ڼ� ���ڵ�
			System.out.println("bytes3.length : " + bytes3.length);  // 15��
			String str3 = new String(bytes3, "EUC-KR");   // ���� ���ڵ�
			System.out.println("bytes3 -> String : " + str3);  // "�ȳ��ϼ��䰡 �ȳ����� ���� ������ ����"
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
