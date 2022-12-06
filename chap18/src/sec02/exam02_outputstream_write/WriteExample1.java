package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test1.txt");
		
		byte[] data = "ABC".getBytes();
		// .getBytes() : String 문자열을 1바이트씩 가져와서 바이트 배열에 저장
		// .getBytes() : String을 byte[] 로 만든다.
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
			// write(int) : 매개변수 int값으로 하나인 경우
			// .write(byte[] b) : 출력 스트림에 매개값으로 주어진 바이트 배열 b의 모든 바이트를 보낸다.
			// 즉, 한 바이트씩 OutputStream으로 전송한다.
		}
		os.flush();
		// flush() : 버퍼에 잔류하는 즉 남아있을 수 있는 모든 바이트를 출력한다.
		os.close();
	}
}
