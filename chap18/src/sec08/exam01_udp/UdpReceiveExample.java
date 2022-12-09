package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		/* ������ ���� : ���ε��� Ư�� ��Ʈ�� ������ �޾Ƽ� ����
		 * 1) DatagramSocket ����
		 * 2) DatagramPacket ����
		 * 3) DatagramPacket ����
		 * 4) DatagramScoket �ݱ�
		 */
		
		DatagramSocket datagramSocket = new DatagramSocket(5001);
		
		// Thread ���� Ŭ�����κ��� �۾� ������ ���� : �͸� �ڽ� ��ü ���
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[���� ����]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						// ���� 100��¥�� ����Ʈ �迭 ���� packet�� ����
						datagramSocket.receive(packet);
						// ������ ���� ������ ��, �����Ͱ� �Է� �� ������ ����Ѵ�.
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						// packet���� �����͸� �������µ� 0��° �ε������� packet�� ���̸�ŭ ��������
						// �����͸� ������ �� "UTF-8"�� ���ڵ�(byte ����Ʈ->String ���ڿ�)�ؼ� �����´�.
						System.out.println("[���� ����: " + packet.getSocketAddress()+ "] " + data);
					}
				}catch(Exception e) {
					System.out.println("[���� ����]");
				}
			}
			
		};
		thread.start();
		// �۾� �����带 ���ķ� �����Ų��.
		
		Thread.sleep(10000);
		// 10000mill = 10�� ���� ���ν����带 �Ͻ����� ���·� �����.
		datagramSocket.close();
	}
}
