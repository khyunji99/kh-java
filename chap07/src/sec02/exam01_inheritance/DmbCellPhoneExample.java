package sec02.exam01_inheritance;

// 실행용 클래스 : 실행 가능한 클래스
public class DmbCellPhoneExample {
	// 필드
	// 생성자
	
	// 메서드
	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		// 참조변수, 지역변수(local variable) : {} 괄호 안에서 생성되고 {} 가 끝나면 사라진다. 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("사과폰", "검정색", 11);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// 부모(CellPhone)으로부터 상속 받은 메서드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요. 누구세요?");
		dmbCellPhone.receiveVoice("안녕하세요? 저는 길현지라고 합니다.");
		dmbCellPhone.sendVoice("아, 안녕하세요. ");
		dmbCellPhone.hangUp();
		
		// 자식(DmbCellPhone) 메서드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();
		
	}

}
