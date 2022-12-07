package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		
		// 보조스트림 BufferedInputStream 사용하지 않은 경우
		FileInputStream fis1 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		// FileInputStream : 바이트기반의 입력스트림
		// 파일 시스템은 "절대 경로"로 적어져야 읽어올 수 있다.
		// 절대 경로(path) ex) C:\\dev\\workspace\\...\\forest.jpg
		// 상대 경로(path) ex) forest.jpg
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
		fis1.close();
		
		
		// 보조스트림 BufferedInputStream 사용한 경우
		FileInputStream fis2 = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec05\\exam03_bufferedinputstream\\forest.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}
}

