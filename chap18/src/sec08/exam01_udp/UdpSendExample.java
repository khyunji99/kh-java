package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {
	public static void main(String[] args) throws Exception {
		/* 발신자 구현 : 소켓 통해 데이터 패킷 전송
		 * 1) DatagramSocket 생성
		 * 2) DatagramPacket 생성
		 * 3) DatagramPacket 발송
		 * 4) DatagramSocket 닫기
		 */
		DatagramSocket datagramSocket = new DatagramSocket();
		
		System.out.println("[발신 시작]");
		
		for(int i = 1; i < 3; i++) {
			String data = "메세지" + i + "from 길현지";
			byte[] byteArr = data.getBytes("UTF-8");
			// 보내는 데이터를 UTF-8 로 인코딩(문자 -> 바이트)
			// UTF-8은 가변형(한글-3bytes, 영자-1byte) 문자형
			DatagramPacket packet = new DatagramPacket
					(byteArr, byteArr.length,
							new InetSocketAddress("192.168.30.199", 5001));
			
			datagramSocket.send(packet);
			System.out.println("[보낸 바이트 수]: " + byteArr.length + "bytes");
			
		}
		System.out.println("[발신 종료]");
		datagramSocket.close();
	}
}
