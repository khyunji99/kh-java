package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// FileOutputStream : ����Ʈ����� ���� ��� ��Ʈ��
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		// ObjectOutputStream : ��ü ����� ���� ��Ʈ��
		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		oos.writeObject(classC);
		oos.flush();	oos.close();  fos.close();	
	}
}