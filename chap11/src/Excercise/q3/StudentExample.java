package Excercise.q3;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		
		// Student key�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");
		hashMap.put(new Student("3"), "100");
		
		// new Student("1") �� ������ �о��
		String score = hashMap.get(new Student("1"));
		String score1 = hashMap.get(new Student("3"));
		
		// Student ��ü �� key���� num = 1�� ������ �ִ� ��ü��
		// value���� �����ͼ� score������ �־��ش�.
		System.out.println("1�� �л��� ���� : " + score);
		System.out.println("3�� �л��� ���� : " + score1);
		
	}
}
