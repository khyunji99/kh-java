package sec03.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		// 콘솔에 outputStream을 만드는 것
		// byte 단위로 적는다!!
		
		for(byte b = 48; b < 58; b++) { // 아스키코드 48에서 57까지의 문자 출력
			os.write(b);                // 0123456789 출력
		}
		os.write(10);
		// 라인피드(10)을 출력하면 다음 행으로 넘어간다.
		
		for(byte b = 97; b < 123; b++) { // 아스키코드 97에서 122까지의 문자 출력
			os.write(b);                 // abcdefghijklmnopqrstuvwxyz 출력
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
	}
}

