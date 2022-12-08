package sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("����ǻ�� IP�ּ�: " + local.getHostAddress());
			// getHostAddress() : String Ÿ������ �� ��ǻ���� IP �ּҸ� ��ȯ���ش�.
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			// getAllByName() : �� ��ǻ�Ϳ� �ִ� ������ ���� ������ ���� ���� �������
			//                  �̸��� �˻��ؼ� IP �ּҸ� �� �װɷ� ������ ã�ư��� ���̴�.
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP�ּ�: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

