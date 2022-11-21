package sec05.exam01_anonymous_extends;

public class Anonymous {
	
	// �ʵ�
	// 1) �ʵ忡 �͸� �ڽ� ��ü�� �����ؼ� �ʵ� �� �ʱ�ȭ
	// �θ�Ŭ������ + ���� = new + �͸� �ڽ� ��ü
	// �θ� Ŭ���� ������ Ÿ���� ��������� �͸� �ڽ� ��ü�� ���� ��, �ʱ�ȭ�ϴ� ���̴�.
	Person field = new Person() {
		// �ʵ�
		// �޼���
		void work() {
			System.out.println("ȸ��� �ʹ��ʹ� ����� �մϴ�.");
		}
		
		// Person �������̽��� ����� �߻� �޼��� ������
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
		
	};
	
	// ������
	
	// �޼���
	void method1() {
		// ���� ����(����� {}�� ������ �������.)
		// 2) ���ú��� ���� �͸� �ڽ� ��ü ����
		// �θ� Ŭ������ + ���� = �͸� �ڽ� ��ü ���� <-- �͸� �ڽ� ��ü ����
		// �޼��� �ȿ� �ִ� �������� ���� �͸� �ڽ� ��ü�� �����ϴ� ���̴�.
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("�����Ӱ� ��å�� �մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		
		localVar.wake(); // method1() �޼��带 �����ϴ� ���̴�..?
		
	}
	
	
	void method2(Person person) {
		person.wake();
	}
	
	
}











