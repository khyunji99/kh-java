package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	@Override  // 컴파일러에게 재정의된 메서드임을 검토하게 만드는 역할
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
		
	}
	
	
}


