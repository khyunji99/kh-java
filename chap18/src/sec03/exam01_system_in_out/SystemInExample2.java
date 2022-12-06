package sec03.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws Exception {			
		InputStream is = System.in;
		// InputStream : 바이트 기반의 입력 스트림
		byte[] datas = new byte[100];
		
		System.out.print("이름: ");
		int nameBytes = is.read(datas);
		// datas 배열에 읽은 데이터를 저장하고 읽어온 데이터의 개수를 nameBytes에 대입
		String name = new String(datas, 0, nameBytes-2);
		// nameBytes개수에서 -2를 하는 이유
		// 문자열의 맨 마지막의 두개는 엔터키값으로 그걸 제외한게 진짜 내가 구하고자 하는 길이이다.
		
		System.out.print("하고 싶은 말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("하고 싶은 말: " + comment);
		
	}
}

