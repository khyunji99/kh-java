package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// 바이트기반의 파일 입출력스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 객체입출력 보조스트림
		
		Child child = new Child();
		child.field1 = "홍길동";
		child.field2 = "홍삼원";
		oos.writeObject(child);
		// Child 클래스를 구현클래스가 아닌 그냥 일반클래스로 만든다면
		// oos.writeObject(child); 는 NotSerializableException 발생한다.
		// 객체를 바이트로 쪼개려면 Serializable를 구현한 구현 클래스로 만들어진 객체여야한다.
		// 그냥 일반 클래스로 객체를 만들면 바이트로 쪼갤 수 없다는 것이다.
		// 따라서 그냥 일반 클래스로 객체를 만든다면 ObjectOutputStream 사용할 수 없다.
		oos.flush(); oos.close(); fos.close();	
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		ois.close(); fis.close();
	}
}
// 바이트기반의 출력 스트림을 만들고 보조 스트림을 사용한다.
// Child 객체를 만든다.
// 그 Child 클래스에 있는 필드에 값을 지정해서 넣어준다.
// writeObject()에 그 Child 객체를 넣는다.
// readObject() 로 그 Child 객체를 읽는다.