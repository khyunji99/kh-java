package sec05_try_with_resources;

// AutoCloseable : 자동으로 close 할 수 있도록 구현된 interface
// FileInputStream 구현 클래스
public class FileInputStream implements AutoCloseable {
	// 필드
	private String file;
	
	// 생성자
	public FileInputStream(String file) {
		this.file = file;
	}
	
	// 메서드
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	
	// AutoCloseable 인터페이스에 있는 추상 메서드 재정의한 메서드
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
