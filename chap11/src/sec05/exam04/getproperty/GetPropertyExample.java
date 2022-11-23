package sec05.exam04.getproperty;

import java.util.Properties;
import java.util.Set;

// getProperty( ) : 시스템 프로퍼티 읽기
public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);
		
		// getProperties( ) 는 Properties 타입으로 만들어야 한다..?
		Properties props = System.getProperties();
		// HashMap : Map 자료구조, <Key, Value> <-- Key와 Value의 값의 데이터타입 같게만 아무거나 들어오면 된다.
		// Properties : Map 자료구조, <String, String> <-- 여기서는 Key와 Value값의 데이터타입은 String으로만 된다.
		// <"os.name", "Windows 10"> / <"user.name", "user2"> / <"user.home", "C:\Users\ user\2>
		
		Set keys = props.keySet();  // key값들은 Set 자료구조로 담겨진다.
		                            // Set 자료구조의 특징은 순서가 없고, 중복된 값 없이 담겨진다.
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ] " + value);
		}
		
		
	}
}
