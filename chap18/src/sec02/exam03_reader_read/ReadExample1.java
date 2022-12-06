package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/dev/test.txt");
		int readData;
		
		while( true ) {
			readData = reader.read();
			// read() : 매개변수 없는 경우
			// read() : 입력 스트림으로부터 한개의 문자(2byte씩)를 읽고 리턴
			if(readData == -1) // readData == -1 이라는 얘기는 더이상 읽어 올 데이터가 없다는 이야기
				break;
			
			System.out.print((char)readData);
		}
		reader.close();
		// close() : 사용한 시스템 자원을 반납하고 입력 스트림을 닫는다.
	}
}
