package sec14.exam01_date;

import java.text.*;
import java.util.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		// 현재 시간과 날짜 반환
		String strNow1 = now.toString();
		System.out.println(strNow1);
		// Tue Nov 29 16:38:47 KST 2022 출력
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		// HH --> 24시 기준으로 시간 설정 , hh --> 오전 오후 나뉘어서 시간 설정
		String strNow2 = sdf.format(now);
		// 시간과 날짜 출력하는 형식 바꾸는 메서드..?
		System.out.println(strNow2);
		// 2022년 11월 29일 04:38:47 출력
	}
}

