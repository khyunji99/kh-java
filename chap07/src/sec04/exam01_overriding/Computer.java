package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	@Override  // �����Ϸ����� �����ǵ� �޼������� �����ϰ� ����� ����
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
		
	}
	
	
}


