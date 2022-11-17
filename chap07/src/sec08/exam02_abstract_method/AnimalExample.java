package sec08.exam02_abstract_method;

public class AnimalExample {
	// �޼���
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		/* ���������� �ڵ� Ÿ�� ��ȯ */
		// animal : ��������, ��������
		Animal animal = null;   // null �� �ʱ�ȭ �Ѵٴ� �ǹ̴�
		                        // �� �������� ����ٴ� ��
		
		animal = new Dog();     // �ڵ�����ȯ, �θ� <- �ڽ�
		animal.sound();         // animal ������������ Dog ��ü��
		                        // ������ �� Dog ��ü�� sound �޼��尡
		                        // ȣ��ȴ�.
		
		animal = new Cat();     // �ڵ�����ȯ
		animal.sound();         // �̹��� animal ���������� Cat ��ü��
		                        // ������ , �ּҰ��� ������
		                        // Cat ��ü�� �ּҰ��� ������ sound �޼��带
		                        // ȣ���ϰ� �Ǵ� �߿����� ��µȴ�.
		
		
		/* �Ű������� �ڵ� Ÿ�� ��ȯ */
//		animalSound(); �ȿ��� Animal Ŭ������ ���� ��ü�� ���� �Ѵ�.
//		animalSound(new Animal());   ������ �̷��� Animal Ŭ������ ������ ��ü�� �ٷ� ���� �� ����.
//		                             Animal Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ���� �����̴�.
		animalSound(new Dog());  // �ڵ�����ȯ, �θ� <- �ڽ�
		                         // Dog Ŭ������ ��ӹ��� �ڽ� Ŭ������ �ڽ� Ŭ������ ���� ��ü�� �θ� Ŭ������ �ڵ����� ����ȯ�ȴ�.
		animalSound(new Cat());
		
		
		
	}
	
	
	// �޼���
	// �߻� Ŭ���� Ÿ���� �Ű������� �޴� �޼���
	// �߻� Ŭ������ �ִ� �߻� �޼��� sound �޼��带 ȣ���ϴ� �޼���
	public static void animalSound (Animal animal) {
		animal.sound();
	}
	
}
