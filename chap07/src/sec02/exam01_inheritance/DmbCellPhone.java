package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	// 생성자
	DmbCellPhone(String model, String color, int channel){
//		super();                 // 부모의 기본생성자를 호출하여 부모객체 생성함
		                         // 상속받으면 super(); 를 컴파일러가 자동으로 적어준다
		                         // 다만, 눈에 보이지 않을뿐
		this.model = model;      // 부모 필드 상속받아 옴
		this.color = color;      // 상속
		this.channel = channel;  // 자식 생성
	}
	
	// 메서드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 마칩니다.");
	}
	
	
	
}

