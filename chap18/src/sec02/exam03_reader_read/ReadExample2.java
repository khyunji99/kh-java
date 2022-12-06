package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/dev/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		
		while( true ) {
			readCharNo = reader.read(cbuf);
			// read(char[] cbuf) : 매개값이 char 배열 하나인 경우
			// 입력 스트림으로부터 읽은 문자들을 매개값으로 주어진 문자 배열
			// cbuf에 저장하고 실제로 읽은 문자의 개수를 리턴
			if(readCharNo == -1)
				break;
			
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
	}
}
