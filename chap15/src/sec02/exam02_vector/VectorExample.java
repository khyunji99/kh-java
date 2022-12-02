package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("����1", "����1", "�۾���1")); 
		list.add(new Board("����2", "����2", "�۾���2")); 
		list.add(new Board("����3", "����3", "�۾���3")); 
		list.add(new Board("����4", "����4", "�۾���4")); 
		list.add(new Board("����5", "����5", "�۾���5")); 
		// Board��ü list�� �߰�
		
		list.remove(2); // ����3 �ִ� ��ü ���ŵ�
		list.remove(3); // ����5 �ִ� ��ü ���ŵ�
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			// list �迭�� ��ҵ��� Board Ÿ������ �����̴�.
			System.out.println(board.toString());
			// ��� ���
		}
		
		
		
	}

}
