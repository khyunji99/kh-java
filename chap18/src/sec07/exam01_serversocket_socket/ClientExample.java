package sec07.exam01_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		socket = new Socket();
		System.out.println( "[���� ��û]");
		
		try {
			socket.connect(new InetSocketAddress("192.168.30.199", 5001));
			System.out.println( "[���� ����]");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}