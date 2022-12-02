package sec04.exam01_unsynchronized;

public class Calculator {
	private int memory; // 공유되는 필드

	public int getMemory() {
		return memory;
	}
	// 동기화 메서드
	// 하나의 스레드만 실행할 수 있도록 만들어주는 것 => 동기화 메서드 및 동기화 블럭 (synchronized)
	// 이걸 사용하게 되면 지연 시간이 생긴다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초후 의미
		} catch(InterruptedException e) {
			
		}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

