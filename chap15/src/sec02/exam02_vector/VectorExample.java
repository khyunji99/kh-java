package sec02.exam02_vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1")); 
		list.add(new Board("제목2", "내용2", "글쓴이2")); 
		list.add(new Board("제목3", "내용3", "글쓴이3")); 
		list.add(new Board("제목4", "내용4", "글쓴이4")); 
		list.add(new Board("제목5", "내용5", "글쓴이5")); 
		// Board객체 list에 추가
		
		list.remove(2); // 제목3 있는 객체 제거됨
		list.remove(3); // 제목5 있는 객체 제거됨
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			// list 배열의 요소들은 Board 타입형의 값들이다.
			System.out.println(board.toString());
			// 목록 출력
		}
		
		
		
	}

}
