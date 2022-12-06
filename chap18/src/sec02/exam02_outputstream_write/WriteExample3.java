package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/dev/test3.txt");
		byte[] data = "ABC".getBytes();
		
		os.write(data, 1, 2);
		// write(data, 1, 2) : 매개변수 2개 이상인 경우
		// write(data, 1, 2) : data 배열에서 1번 인덱스부터 2개의 데이터 값 가져와서 쓰기
		os.flush();
		os.close();
	}
}
