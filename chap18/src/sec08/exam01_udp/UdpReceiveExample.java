package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		/* 수신자 구현 : 바인딩한 특정 포트로 데이터 받아서 저장
		 * 1) DatagramSocket 생성
		 * 2) DatagramPacket 생성
		 * 3) DatagramPacket 수신
		 * 4) DatagramScoket 닫기
		 */
		
		DatagramSocket datagramSocket = new DatagramSocket(5001);
		
		// Thread 하위 클래스로부터 작업 스레드 생성 : 익명 자식 객체 사용
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						// 공간 100개짜리 바이트 배열 만들어서 packet에 넣음
						datagramSocket.receive(packet);
						// 소켓이 들어올 때까지 즉, 데이터가 입력 될 때까지 대기한다.
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						// packet에서 데이터를 가져오는데 0번째 인덱스부터 packet의 길이만큼 가져오고
						// 데이터를 가져올 때 "UTF-8"로 디코딩(byte 바이트->String 문자열)해서 가져온다.
						System.out.println("[받은 내용: " + packet.getSocketAddress()+ "] " + data);
					}
				}catch(Exception e) {
					System.out.println("[수신 종료]");
				}
			}
			
		};
		thread.start();
		// 작업 스레드를 병렬로 실행시킨다.
		
		Thread.sleep(10000);
		// 10000mill = 10초 동안 메인스레드를 일시정지 상태로 만든다.
		datagramSocket.close();
	}
}
