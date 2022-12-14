package sec04.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		// FileWriter : 문자기반의 파일 출력 스트림
		// FileWriter(file, true) : 기존의 파일 내용 끝에 데이터를 추가하는 경우
		
		fw.write("FileWriter는 한글로된 " + "\r\n"); // "\r\n" : 줄바꿈
		fw.write("문자열을 바로 출력할 수 있다. " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
	}
}

