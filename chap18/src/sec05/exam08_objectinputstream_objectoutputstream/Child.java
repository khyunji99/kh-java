package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable 를 구현한 Child 구현 클래스이면서 Parent 클래스의 자식 클래스
// writeObject()와 readObject() 매서드
public class Child extends Parent implements Serializable {
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
	   out.writeUTF(field1);
	   out.defaultWriteObject();
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
	   field1 = in.readUTF();
	   in.defaultReadObject();
	}
	
}
