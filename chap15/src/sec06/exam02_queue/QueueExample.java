package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// Queue �������̽� �� ������ LinkedList Ŭ����
		// �������̽� ������� : ���, �߻�޼���, ����Ʈ�޼���, �����޼���
		// Queue<Message> messageQueue = new Queue<Message>(); <- Queue�� �������̽��̹Ƿ� �̷��� ��������
		// ���� Queue�� Queue�� ����� ���� �ƴ϶� LinkedList�� Queue�� �����.
		Queue<Message> messageQueue = new LinkedList<Message>(); // �������̽� = ���� ��ü
		
		
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKaKaoTalk", "ȫ�β�"));
		
		while(messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� ���ڸ� �����ϴ�.");
				break;
			case "sendKaKaoTalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
				break;
			}
		}
	}
}
