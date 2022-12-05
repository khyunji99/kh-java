package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// Queue 인터페이스 를 구현한 LinkedList 클래스
		// 인터페이스 구성멤버 : 상수, 추상메서드, 디폴트메서드, 정적메서드
		// Queue<Message> messageQueue = new Queue<Message>(); <- Queue는 인터페이스이므로 이렇게 생성못함
		// 따라서 Queue는 Queue로 만드는 것이 아니라 LinkedList로 Queue를 만든다.
		Queue<Message> messageQueue = new LinkedList<Message>(); // 인터페이스 = 구현 객체
		
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaoTalk", "홍두께"));
		
		while(messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKaKaoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
