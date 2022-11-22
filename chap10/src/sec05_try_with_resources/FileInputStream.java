package sec05_try_with_resources;

// AutoCloseable : �ڵ����� close �� �� �ֵ��� ������ interface
// FileInputStream ���� Ŭ����
public class FileInputStream implements AutoCloseable {
	// �ʵ�
	private String file;
	
	// ������
	public FileInputStream(String file) {
		this.file = file;
	}
	
	// �޼���
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	
	// AutoCloseable �������̽��� �ִ� �߻� �޼��� �������� �޼���
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
