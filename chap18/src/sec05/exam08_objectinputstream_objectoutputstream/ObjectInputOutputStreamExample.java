package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		// FileOutputStream : ����Ʈ����� ������½ý���
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		// ObjectOutputStream : ��ü ����� ���� ��Ʈ�� �� ��º�����Ʈ��
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] { 1, 2, 3 });
		oos.writeObject(new String("ȫ�浿"));
		// writeObject(Object obj) : Object Ÿ���� ���� �Ű������� �ִ´�.
		// ������� ��ü���� "C:/Temp/Object.dat" ���Ͽ� ������.
		
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
		System.out.println(obj4); // ȫ�浿
	}
}
// �������� ������ ����Ʈ�� �ߴ�...?
