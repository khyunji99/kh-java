package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		// FileInputStream �� ���ҽ� ��ü��� ��������.
	/*	FileInputStream fis = null;
		
		// try-with-resource ù��° ���
		try {
			
			fis = new FileInputStream("file.txt");
			fis.read();
			
			// ���� �ڵ�� ���ܰ� �߻����� �����Ƿ� ������ ���� ���ܸ� ������ �������
			throw new Exception();
			
		} catch (Exception e) {
			
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
			
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	*/
		
		// try-with-resource �ι�° ���
		try(FileInputStream fis = new FileInputStream("file.txt")) {
		
			fis.read();
			throw new Exception();  // ������ ���� �������
			
		} catch (Exception e) {
			
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
			
		} 
	}
}
