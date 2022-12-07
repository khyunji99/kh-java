package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		// FileOutputStream : ����Ʈ����� ���� ��½�Ʈ��
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("ȫ�浿");
		// .writeUTF("ȫ�浿") : UTF-8���ڵ��� ����Ͽ� ��� ��Ʈ���� ���ڿ��� ���´�.
		dos.writeDouble(95.5);
		// Double������ �������� ����Ʈ ������ ���Ͽ� ������.
		dos.writeInt(1);
		
		dos.flush();
		dos.close();
		fos.close();
		
		// ������ ���� �����Ѱ� �о��
		// FileInputStream : ����Ʈ����� ���� �Է½�Ʈ��
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 1; i++) {
			String name = dis.readUTF();
			Double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("name: " + name + ", score: " + score + ", order: " + order);
		}
		dis.close();
		fis.close();
		
	}
}

