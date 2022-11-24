package sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car( );
		Class clazz1 = car.getClass();  // 1. ��ü.getClass() ȣ�� : car ��ü�� ���� Ŭ���� ��ü�� ���ʹ�.(�ʵ�, �޼��� ���� �������� ���ʹٴ� ��)
		System.out.println(clazz1.getName()); // Ŭ���� Ǯ������ �������� ��
		System.out.println(clazz1.getSimpleName());  // Ŭ���� Ǯ���ӿ��� ��Ű������ Ŭ������ �������� ��
		System.out.println();
		
		
		// forName(); <-- ���� ���� ����ϴ� �޼���! ������ ��
		try {
			// 2. Class.forName("���ڿ�") ȣ���Ͽ� Class ��ü�� ��´�.
			Class clazz2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName()); // ��Ű���̸�
			System.out.println(clazz2.getPackageName()); // ��Ű���̸�
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
}
