package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] array0 = {'J', 'A', 'V', 'A'};
		
		// 배열 복사 방법 0 (원초적인 방법)
		// for문
		char[] array1 = new char[4];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = array0[i];
		}
		
		System.out.println(Arrays.toString(array1));
		
		
		// 배열 복사 방법 1 (설명 안하심)
		// Arrays.copyOfRange(원본 배열, 시작 인덱스, 끝 인덱스)
		// - 시작 인덱스 ~ (끝 인덱스 - 1) 까지의 항목 복사
		char[] array2 = Arrays.copyOfRange(array1, 0, array1.length);
		System.out.println(Arrays.toString(array2));
		
		
		// 배열 복사 방법 2
		// Arrays.copyOf(원본배열, 복사할 길이)
		// - 0 ~ (복사할 길이 - 1) 인덱스까지의 항목을 복사
		// - 복사할 길이는 원본 배열의 길이보다 커도 된다.
		char[] array3 = Arrays.copyOf(array0, array0.length);
		System.out.println(Arrays.toString(array3));
		
		
		// 배열 복사 방법 3
		// System.arraycopy(원본배열, 원본시작인덱스, 타겟배열, 타겟시작인덱스, 복사할개수)
		char[] array4 = new char[4];
		System.arraycopy(array0, 0, array4, 0, array0.length);
		System.out.println(Arrays.toString(array4));
		
	}
}

