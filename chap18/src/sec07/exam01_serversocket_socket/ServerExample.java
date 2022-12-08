package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			// serverSocket = new ServerSocket(5001); �� ������ ���� ���ٰ� ���� ��
			// localhost : �� �ڽ��� IP �ּ�  , 5001 : ��Ʈ
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket = serverSocket.accept();  // ������.. socket�� ��û�� ������ ������ ���
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();  
				// InetSocketAddress : SocketAddress�� �ڽ� Ŭ������ ���� ����ȯ ����
				// getRemoteSocketAddress() �޼��尡 SocketAddress Ÿ������ �����ϱ⶧��
				System.out.println("[���� ������] " + isa.getHostName());  // getHostName : 127.0.0.1
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
