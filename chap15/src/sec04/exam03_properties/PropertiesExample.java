package sec04.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		// Properties 객체 생성 = Map<String, String>
		Properties properties  = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		// decode() : 한글들을 처리하기 위해 사용되는 메서드
		properties.load(new FileReader(path));
		// FileReader : File의 IO(입출력)을 담당하는 클래스
		// load() : = 를 기준으로 = 앞은 key값으로 = 뒤는 value값으로 읽는 메서드
		// [{"driver" : "oracle.jdbc.OracleDirver"}, {"username" : "scott"}, ....]
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password"); 
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}

