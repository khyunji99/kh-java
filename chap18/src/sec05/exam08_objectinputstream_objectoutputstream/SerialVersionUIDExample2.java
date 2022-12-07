package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		// 직렬화된 객체를 역직렬화 한 것
		System.out.println("field1: " + classC.field1);
	}
}
