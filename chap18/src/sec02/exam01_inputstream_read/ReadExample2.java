package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/dev/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		
		while(true) {
			readByteNo = is.read(readBytes); // 3bytes씩 데이터를 읽어온다. 즉, 배열의 크기만큼 읽어오는 것
			// read(readBytes) : 매개변수 하나인 경우
			// 읽어온 데이터는 readBytes 배열에 저장되고 읽은 데이터의 개수는 readByteNo에 담겨진다.
			System.out.println(readByteNo);
			if(readByteNo == -1)
				break;
			
			data += new String(readBytes, 0, readByteNo);
			// readBytes 배열의 인덱스 0번부터 readByteNo의 개수만큼..
		}
		System.out.println(data.toString());
		System.out.println(data); // 위의 data.toString() 출력한것과 동일하게 출력됨. "C:/dev/test.txt"
		is.close();
	}
}
