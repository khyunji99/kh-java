package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// FileOutputStream : 바이트기반의 파일출력시스템
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		// ObjectOutputStream : 객체 입출력 보조 스트림 중 출력보조스트림
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("홍길동"));
		// writeObject(Object obj) : Object 타입의 값을 매개변수로 넣는다.
		// 만들어진 객체들을 "C:/Temp/Object.dat" 파일에 보낸다.
		
		oos.flush();	oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1); // 10
		System.out.println(obj2); // 3.14
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]); // 1,2,3
		System.out.println(obj4); // 홍길동
	}
}
// 읽을때도 쓸때도 바이트로 했다...?
