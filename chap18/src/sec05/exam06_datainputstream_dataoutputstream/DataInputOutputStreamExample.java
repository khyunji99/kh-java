package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// FileOutputStream : 바이트기반의 파일 출력스트림
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		// .writeUTF("홍길동") : UTF-8인코딩을 사용하여 출력 스트림에 문자열을 적는다.
		dos.writeDouble(95.5);
		// Double형으로 적었지만 바이트 단위로 파일에 적힌다.
		dos.writeInt(1);
		
		dos.flush();
		dos.close();
		fos.close();
		
		// 위에서 파일 저장한거 읽어보기
		// FileInputStream : 바이트기반의 파일 입력스트림
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 1; i++) {
			String name = dis.readUTF();
			Double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("name: " + name + ", score: " + score + ", order: " + order);
		}
		dis.close();
		fis.close();
		
	}
}

