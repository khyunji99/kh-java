package sec05.exam03_systemtime;

// nanoTime( ) : ����ð��� �������(?)�� �ɰ��� long������ �������ִ� �޼���
public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("����ϴµ� " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
