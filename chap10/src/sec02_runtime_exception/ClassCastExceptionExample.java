package sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);  // Animal Ÿ���� �Ű������� Dog Ÿ���� ���ڰ� dog ����
		
		Cat cat = new Cat();
		// �Ʒ��� changeDog(cat);  <-- ClassCastException �߻�
		// changeDog �޼���� Animal�� Ÿ���� �Ű������� �޴� �޼����̴�.
		// �� ���� �Ű������� Dog������ �ٿ�ĳ���� ���ִ� ����� ������ �ִµ�
		// �ٿ� ĳ������ �Ϸ��� �� ���� Dog���� Animal������ ��ĳ������ �Ǿ������
		// Dog������ �ٿ�ĳ���� �� ���� �ִ�.
		// ������ cat������ Cat������ ������� �����̹Ƿ� �ٿ�ĳ������ ���ǿ�
		// �������� �ʴµ� ������ �ٿ�ĳ���� �Ϸ��� �ϴ� ���� �߻��Ѵ�.
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog)  // if�� �־��ְ� �Ǹ� ClassCastException ���� �߻� ���ɼ� ������
		//{
			Dog dog = (Dog) animal;   // ClassCastException �߻� ���ɼ� ����
		//} 
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

