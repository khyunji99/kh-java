package sec05.exam07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		// FileOutputStream : 바이트기반의 파일 출력스트림
		FileOutputStream fos = new FileOutputStream("C:/temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		// println() : 
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		// 바이트기반이라서 바이트로 데이터를 넣어야하는데 보조스트림 PrintStream을
		// 사용해서 그에 대한 메서드를 사용함으로 문자열을 집어넣고 문자열을 출력하게 한다. 
		
		ps.flush();
		ps.close();
		fos.close();
		
	}
}
