package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		// key값에는 새로 생성된 Key 객체가 들어가고
		// value값에는 "홍길동" 문자열이 들어간다.
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		// 여기 get( ) 안에 들어간 생성된 Key객체는
		// 앞에 있는 Key객체와는 다른 객체이다.
		// 여기 들어간 new Key(1)는 새로 또 생성된 Key객체이다.
		// 그래서 얘는 value값이 없다. 따로 지정을 안해줬기 때문이다.
		// 그래서 value값은 null이 출력된다.
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}


