package sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
			// getHostAddress() : String 타입으로 내 컴퓨터의 IP 주소를 반환해준다.
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			// getAllByName() : 내 컴퓨터에 있는 도메인 네임 서버에 가서 내가 가고싶은
			//                  이름을 검색해서 IP 주소를 얻어서 그걸로 서버를 찾아가는 것이다.
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

