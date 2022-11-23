package sec05.exam04.getproperty;

import java.util.Properties;
import java.util.Set;

// getProperty( ) : �ý��� ������Ƽ �б�
public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("�ü�� �̸� : " + osName);
		System.out.println("����� �̸� : " + userName);
		System.out.println("����� Ȩ���丮 : " + userHome);
		
		// getProperties( ) �� Properties Ÿ������ ������ �Ѵ�..?
		Properties props = System.getProperties();
		// HashMap : Map �ڷᱸ��, <Key, Value> <-- Key�� Value�� ���� ������Ÿ�� ���Ը� �ƹ��ų� ������ �ȴ�.
		// Properties : Map �ڷᱸ��, <String, String> <-- ���⼭�� Key�� Value���� ������Ÿ���� String���θ� �ȴ�.
		// <"os.name", "Windows 10"> / <"user.name", "user2"> / <"user.home", "C:\Users\ user\2>
		
		Set keys = props.keySet();  // key������ Set �ڷᱸ���� �������.
		                            // Set �ڷᱸ���� Ư¡�� ������ ����, �ߺ��� �� ���� �������.
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ] " + value);
		}
		
		
	}
}
