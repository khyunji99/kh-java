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
			// serverSocket = new ServerSocket(5001); 이 한줄이 위의 두줄과 같은 것
			// localhost : 내 자신의 IP 주소  , 5001 : 포트
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();  // 실행대기.. socket에 요청이 들어오기 전까지 대기
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();  
				// InetSocketAddress : SocketAddress의 자식 클래스로 강제 형변환 해줌
				// getRemoteSocketAddress() 메서드가 SocketAddress 타입으로 리턴하기때문
				System.out.println("[연결 수락함] " + isa.getHostName());  // getHostName : 127.0.0.1
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
