package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		// 바이트 기반의 파일 입력스트림 생성
		InputStream is = new FileInputStream("C:/dev/test.txt");
		// FileInputStream 은 파일을 읽어올 때 사용하는 바이트 기반 파일 입력스트림이다.
		int readByte;
		
		while(true) {
			readByte = is.read();
			// read() : 매개변수가 없는 경우
			// .read()는 FileInputStream으로부터 데이터를 1바이트씩 읽어오는 메서드
			// readByte에는 읽어온 데이터가 저장되게 된다.
			System.out.println(readByte);
			
			if(readByte == -1) { // readByte == -1이라는 이야기는 더이상 읽어올 데이터가 없단 얘기
				break;
			}
			System.out.println((char)readByte);
			// readByte는 4byte인데 char는 2byte이니까 강제형변환
		}
		is.close();
	}
}
