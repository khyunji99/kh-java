package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/dev/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		readByteNo = is.read(readBytes, 2, 3);
		// read(readBytes, 2, 3) : 매개변수 두개 이상인 경우
		// readBytes 배열의 2번 인덱스부터 3개의 데이터 읽어와서 넣어줌
		// 즉, readBytes 배열에 3개의 데이터를 넣어주는데 2번 인덱스부터 넣는다.
		// readByteNo는 읽어온 데이터의 갯수 이므로 3이다.
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
