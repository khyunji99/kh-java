package sec05.exam03_systemtime;

// nanoTime( ) : 현재시간을 나노단위(?)로 쪼개서 long값으로 리턴해주는 메서드
public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산하는데 " + (time2-time1) + " 나노초가 소요되었습니다.");
	}
}
