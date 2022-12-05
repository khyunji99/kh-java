package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// 바이트 기반의 파일 입력스트림 생성
		InputStream is = new FileInputStream("C:/dev/test.txt");
		int readByte;
		
		while(true) {
			readByte = is.read();
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
