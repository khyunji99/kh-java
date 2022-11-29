package sec03.exam01_priority;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);
			
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
				// MIN_PRIORITY = 우선순위 1
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
				// MAX_PRIORITY = 우선순위 10
			}
			thread.start();
		}
	}
}

