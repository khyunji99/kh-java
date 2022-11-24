package sec06.exam03_newinstance;

// newInstance();  <-- ����, ���� ����ϴ� �޼���! �����Ѱ�
public class NewInstanceExample {
	public static void main(String[] args) {
		
		// Action action = new SendAction();  // ���� ��ü ����
		
		
		try {
			// ReceiveAction Ŭ������ Ŭ���� ��ü�� �����Ѵ�.
			// ReceiveAction Ŭ������ ��ü�� ����� ���� �ƴϰ�,
			// ReceiveAction Ŭ������ ������
			// ��, ��Ÿ�����͸� ��� Class ��ü�� ����� ���̴�.
			Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			
			
			// clazz.newInstance();
			// ���� ���� forName() �� () �ȿ� ������ ���ڿ��� �ش��ϴ�
			// Ŭ������ Ÿ������ ��ü�� �����ϰ� �װ���
			// Object Ÿ������ �ڵ�����ȯ�ؼ� �������ش�.
			
			Object obj = clazz.newInstance();  // ���� ��ü ����
			// ReceiveAction() ��ü�� �����ǰ�
			// Object Ÿ������ �ڵ�����ȯ�Ѵ�.
			// �ڵ�����ȯ�� �Ǹ� ���������� �����Ѵ�.
			
			Action action = (Action) obj;
			// ������ ��ȯ : Interface <- Object
			// ��������ȯ�� �� ���� : execute()�� �����ؼ� ȣ���ϱ� ����
			
			action.execute();
			
			// ���� 3���� �����ϰ� ����� ������ ����.
			// Action action = (Action) clazz.newInstance();
			// action.execute();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

// Class.forName( )���� ( ) �ȿ� ������ ���ڿ��� ���� 
// �� ���ڿ��� �ش��ϴ� Ŭ������ ������ ��ü�� ���������.
// ������ ReceiveAction Ŭ������ ���ڿ��� �־����� �� ���ڿ��� �ش��ϴ� Ŭ������
// ���� �������� �������� �ǰ� newInstance()�� ȣ���ϸ鼭 �� Ŭ������ ��ü��
// ���������.
// clazz�� �׷��� ReceiveAction Ŭ������ ������ ������� ��ü�� �ּҰ��� ���� �ɰ��̴�.
// forName( )�� ()�ȿ� ������ ���ڿ��� �ش��ϴ� Ŭ������ ������ ClassŸ����
// ��ü�� �����Ѵ�.
// �׸��� �� Class ��ü�� �޼����� newInstance()�� ȣ���ϸ� Ŭ������ü��
// ������ �� �ִ�.
// 
