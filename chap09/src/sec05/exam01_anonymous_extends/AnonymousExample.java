package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		// Anonymous ������ Ÿ���� ������ Anonymous ��ü �����ؼ� ����
		Anonymous annoy = new Anonymous();
		
		annoy.field.wake();
		annoy.method1();   // method1�� ���ǵ� �͸� �ڽ� ��ü�� �����Ǹ鼭
		                   // �� �͸� �ڽ� ��ü�� ����ִ� ���ú�����
		                   // wake() �޼��尡 ����ȴ�.
		
		// ���ڰ��� �͸� �ڽİ�ü�� �־��� ���̴�.
		// Person Ŭ���� Ÿ���� ������ ���ڷ� ���� ���� �ƴϴ�!
		// 3) �Ű������� �͸� �ڽ� ��ü�� ����
		annoy.method2(new Person(){
			void study() {
				System.out.println("�����մϴ�.");
			}
			// Person Ŭ������ �ִ� wake() �޼��� ������
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
		                  
		
		
		
		
	}
}
