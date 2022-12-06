package sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\dev\\workspace\\java\\chap18\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
			int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data);  // System.out : PrintStream(바이트 기반의 표준화면(콘솔) 출력 스트림)
			}
		} catch (Exception e) { // 주어지는 파일이 없을 수 있는 FileNotFoundException 예외가 생길 수 있으니 예외 처리를 해줘야한다.
			e.printStackTrace();
		}

	}
}

