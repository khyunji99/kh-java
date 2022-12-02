package sec02.exam02_vector;

public class Board {
	String subject;
	String contents;
	String writer;
	
	
	public Board(String subject, String contents, String writer) {
		this.subject = subject;
		this.contents = contents;
		this.writer = writer;
	}


	@Override
	public String toString() {
		return subject + ", " + contents + ", " + writer;
	}
	
	
	
}
