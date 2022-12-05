package assignment;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	Board board1 = new Board("����1", "����1");
	Board board2 = new Board("����2", "����2");
	Board board3 = new Board("����3", "����3");
	
	ArrayList<Board> boardList;
	
	public BoardDao() {
		boardList = new ArrayList<>();
		boardList.add(0, board1);
		boardList.add(1, board2);
		boardList.add(2, board3);
	}
	
	public List<Board> getBoardList() {
		return boardList;
		/*
		 * List<Board> list = new ArrayList<Board>();
		 * for(int i = 0; i <= 3; i++){
		 *    list.add(new Board(title: "����" + i, content: "����" + i));
		 * }
		 * return list;
		 */
	}
}
