package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// List ����� ��� 1
		// ArrayList ����Ŭ������ List ����
		// List<> list = new ArrayList<>();
		// < > ���� list �迭�� ��ҷ� ���� ���� ����ŸŸ���� ���´�.
		List<String> list = new ArrayList<String>();
		// �������̽� = ArrayList ������ü
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase"); 
		// list.add(�ε���, "���ڿ�");
		// ������ �ε����� ���ڿ� �ִ� ���� �ǹ�
		// �׷��� ���� �� �ε����� �ִ� ���� ���� �ε����� �Ű�����.
		list.add("myBatis");
		// ( ) �ȿ� ���ڿ��� ���°� <String> ���׸� Ÿ������ �����ؼ�
		// String Ÿ���� ���� �迭��, ( )�ȿ� ���� �Ǵ� ���̴�.
		
		
		int size = list.size();
		System.out.println("�迭�� �� ��ü �� : " + size);
		System.out.println();
		
		//list.get(int index) : �ε����� �ش��ϴ� �� �������ִ� �޼���
		String skill = list.get(2);
		// System.out.println(skill); �Ʒ��� toString() ���� ����ϴ� �Ͱ� ����.
		System.out.println("2�� �ε����� ��: " + skill.toString());
		
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		System.out.println();
		
		
		// �迭 ��� ��������
		// list.remove(int index);
		// �ε����� �ش��ϴ� �迭�� ��Ұ� �����
		// �׷��� ������ �ε��� ���� �ε����� �ִ� ������
		// ������ �ϳ��� ������ ����� �´�.
		list.remove(2);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);

		list.remove("myBatis");
		System.out.println(list);

		System.out.println();
		
		// �̷��� ����� ���� 0, 1�� �ε����� �迭 ��� ���� ���Եȴ�.
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
		System.out.println("--- ���� for������ ���� �ε����� �迭 �� ��� ---");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}
}

