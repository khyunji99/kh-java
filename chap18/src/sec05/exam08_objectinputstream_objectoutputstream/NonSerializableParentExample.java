package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// ����Ʈ����� ���� ����½�Ʈ��
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// ��ü����� ������Ʈ��
		
		Child child = new Child();
		child.field1 = "ȫ�浿";
		child.field2 = "ȫ���";
		oos.writeObject(child);
		// Child Ŭ������ ����Ŭ������ �ƴ� �׳� �Ϲ�Ŭ������ ����ٸ�
		// oos.writeObject(child); �� NotSerializableException �߻��Ѵ�.
		// ��ü�� ����Ʈ�� �ɰ����� Serializable�� ������ ���� Ŭ������ ������� ��ü�����Ѵ�.
		// �׳� �Ϲ� Ŭ������ ��ü�� ����� ����Ʈ�� �ɰ� �� ���ٴ� ���̴�.
		// ���� �׳� �Ϲ� Ŭ������ ��ü�� ����ٸ� ObjectOutputStream ����� �� ����.
		oos.flush(); oos.close(); fos.close();	
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		ois.close(); fis.close();
	}
}
// ����Ʈ����� ��� ��Ʈ���� ����� ���� ��Ʈ���� ����Ѵ�.
// Child ��ü�� �����.
// �� Child Ŭ������ �ִ� �ʵ忡 ���� �����ؼ� �־��ش�.
// writeObject()�� �� Child ��ü�� �ִ´�.
// readObject() �� �� Child ��ü�� �д´�.