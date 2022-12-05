package assignment;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	Board board1 = new Board("力格1", "郴侩1");
	Board board2 = new Board("力格2", "郴侩2");
	Board board3 = new Board("力格3", "郴侩3");
	
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
		 *    list.add(new Board(title: "力格" + i, content: "郴侩" + i));
		 * }
		 * return list;
		 */
	}
}
