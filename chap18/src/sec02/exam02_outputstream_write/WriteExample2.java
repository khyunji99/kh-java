package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test2.txt");
		byte[] data = "ABC".getBytes();
		
		os.write(data);
		// write(byte[] b) : 매개변수 바이트 배열로 하나인 경우
		// byte[] 로 OutputStream으로 한꺼번에 전송한다.
		os.flush();
		os.close();
	}
}
