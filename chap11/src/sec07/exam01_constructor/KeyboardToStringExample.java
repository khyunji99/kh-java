package sec07.exam01_constructor;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100]; // 배열 공간만 확보한 것
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		// 키보드에서 값을 읽어 값 자체는 bytes 배열에 저장하고
		// 읽어서 배열에 저장된 값의 개수는 readByteNo에 저장한다.
		// 그래서 readByteNo는 bytes 배열에 저장된 총 배열 개수를 가진다.

		System.out.println("readByteNo = " + readByteNo); // readByteNo 는 글자의 개수 + 2 한 값이 나온다.
		                                                  
		
		String str = new String(bytes, 0, readByteNo-2); // -2 : 맨 마지막에 있는 엔터키 두개 빼주기
		System.out.println(str);
	}
}
