package sec07.exam02_data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println( "[연결 요청]");
			socket.connect(new InetSocketAddress("192.168.30.199", 5001));
			System.out.println( "[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream(); // 데이터 전달, 출력하기
			message = "안녕하세요 저는 길현지입니다 :0";
			bytes = message.getBytes("UTF-8"); // 문자열 -> 바이트 배열 : 인코딩
			os.write(bytes);
			os.flush();
			System.out.println( "[데이터 보내기 성공]");
			
			InputStream is = socket.getInputStream(); // 데이터 받기
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공]: " + message);
			
			os.close();
			is.close();
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {}
		}
	}
}