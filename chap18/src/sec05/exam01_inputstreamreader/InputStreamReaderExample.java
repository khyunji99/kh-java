package sec05.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		System.out.println("입력: ");
		InputStream is = System.in;
		// 바이트기반의 입력 스트림
		Reader reader = new InputStreamReader(is);	
		// 문자기반의 입력 스트림 으로 변환
		
		int readCharNo;
		char[] cbuf = new char[100];
		
		while ((readCharNo=reader.read(cbuf)) != -1) { // 읽을 데이터가 없을 때까지
	    // 읽은 데이터는 cbuf에 저장되고 읽은 데이터의 개수는 readCharNo에 저장된다.
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
		is.close();
	}
}

