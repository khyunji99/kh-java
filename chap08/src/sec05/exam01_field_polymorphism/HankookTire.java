package sec05.exam01_field_polymorphism;

// Tire 인터페이스를 구현받는 HankookTire 구현클래스
public class HankookTire implements Tire {
	
	// Tire 인터페이스에 있는 추상메서드 재구현(재정의)한 메서드
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
