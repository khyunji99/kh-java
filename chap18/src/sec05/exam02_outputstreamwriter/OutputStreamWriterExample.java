package sec05.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws Exception {	
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		// 바이트기반의 File 출력 스트림
		Writer writer = new OutputStreamWriter(fos);
		// 보조 스트림 OutputStreamWriter 사용해서
		// 문자 스트림에서 바이트 스트림으로 변환
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
	}
}

