package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		// FileInputStream 을 리소스 객체라고 생각하자.
	/*	FileInputStream fis = null;
		
		// try-with-resource 첫번째 방법
		try {
			
			fis = new FileInputStream("file.txt");
			fis.read();
			
			// 위의 코드는 예외가 발생되지 않으므로 다음과 같은 예외를 강제로 만들어줌
			throw new Exception();
			
		} catch (Exception e) {
			
			System.out.println("예외 처리 코드가 실행되었습니다.");
			
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	*/
		
		// try-with-resource 두번째 방법
		try(FileInputStream fis = new FileInputStream("file.txt")) {
		
			fis.read();
			throw new Exception();  // 강제로 예외 만들어줌
			
		} catch (Exception e) {
			
			System.out.println("예외 처리 코드가 실행되었습니다.");
			
		} 
	}
}
