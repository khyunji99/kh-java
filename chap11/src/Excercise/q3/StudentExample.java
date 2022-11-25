package Excercise.q3;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		
		// Student key로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		// new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		hashMap.put(new Student("3"), "100");
		
		// new Student("1") 로 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		String score1 = hashMap.get(new Student("3"));
		
		// Student 객체 중 key값인 num = 1을 가지고 있는 객체의
		// value값을 가져와서 score변수에 넣어준다.
		System.out.println("1번 학생의 총점 : " + score);
		System.out.println("3번 학생의 총점 : " + score1);
		
	}
}
