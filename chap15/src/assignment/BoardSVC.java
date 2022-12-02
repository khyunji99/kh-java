package assignment;

//DAO(Data Access Object) 클래스
import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	ArrayList<BoardVO> boardList;

	public BoardSVC() {
		boardList = new ArrayList();
	}

	//글 입력 처리 메소드
	public void writeArticle(Scanner sc) {
		System.out.println("게시판에 글을 작성 하세요.");
		System.out.print("작성자:");
		String register = sc.next();
		System.out.print("이메일:");
		String email = sc.next();
		System.out.print("비밀번호:");
		String passwd = sc.next();
		System.out.print("제목:");
		String subject = sc.next();
		System.out.print("글내용:");
		String content = sc.next();
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		addArticle(boardVO);
	}

	//글 작성
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	//글목록 출력
	public void listArticles(Scanner sc) {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i).toString());
			}
		} else {
			System.out.println("등록된 글이 없습니다.");
		}
	}

	//삭제할 글의 작성자 및 비밀번호 입력하는 메소드
	public void removeArticle(Scanner sc) {
		//코드 작성
		System.out.println("삭제할 글의 작성자와 비밀번호를 입력하세요.");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("비밀번호: ");
		String passwd = sc.next();
		
		removeArticle(register, passwd);
	}
	
	
	public void removeArticle(String register, String passwd) {
		if (boardList.size() > 0) {
			int flag = -1;
			// 입력한 값이 일치하는게 있는지 확인하는 flag 변수
			// 일치하는 값이 있으면 그 값 boardList에서 지워진다.
			// 지워지면서 flag값이 인덱스 i의 값으로 초기화된다.
			// 그런데 i는 인덱스 값으로 음수가 될 수 없다.
			// 따라서 이중 if문의 모두 조건문에 해당하여 이중 if문 들어가서
			// 일치하는 값이 ArrayList에서 지워지고 flag값이 인덱스 i로
			// 초기화 되면 flag가 -1이냐 아니냐에 따라 일치하는 값이 있는지
			// 없는지를 알 수 있게되는 것이다.
			for(int i = 0; i <boardList.size(); i++) {
				if(boardList.get(i).equals(register)) {
					if(boardList.get(i).equals(passwd)) {
						boardList.remove(boardList.get(i));
						flag = i;
						i--;
						// i-- 해주는 이유
						// i--이 되고 다시 증감식으로 가서 i++을 해주게되면
						// i값은 제자리이다.
						// 앞에서 원래 그 i인덱스 공간에 있던 값을 삭제하여
						// i인덱스의 다음 인덱스에 있는 값이 i인덱스 공간으로
						// 옮겨져온다.
						// 따라서 인덱스를 옮겨서 값을 비교할 필요없이
						// 다시 그 i인덱스로 값을 비교해보면 된다.
					}
				}
			}
			if(flag == -1) {
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
			System.out.println("성공적으로 글이 삭제되었습니다.");
		}else {
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}
}
