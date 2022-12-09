package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {
	public static void main(String[] args) throws Exception {
		/* �߽��� ���� : ���� ���� ������ ��Ŷ ����
		 * 1) DatagramSocket ����
		 * 2) DatagramPacket ����
		 * 3) DatagramPacket �߼�
		 * 4) DatagramSocket �ݱ�
		 */
		DatagramSocket datagramSocket = new DatagramSocket();
		
		System.out.println("[�߽� ����]");
		
		for(int i = 1; i < 3; i++) {
			String data = "�޼���" + i + "from ������";
			byte[] byteArr = data.getBytes("UTF-8");
			// ������ �����͸� UTF-8 �� ���ڵ�(���� -> ����Ʈ)
			// UTF-8�� ������(�ѱ�-3bytes, ����-1byte) ������
			DatagramPacket packet = new DatagramPacket
					(byteArr, byteArr.length,
							new InetSocketAddress("192.168.30.199", 5001));
			
			datagramSocket.send(packet);
			System.out.println("[���� ����Ʈ ��]: " + byteArr.length + "bytes");
			
		}
		System.out.println("[�߽� ����]");
		datagramSocket.close();
	}
}
