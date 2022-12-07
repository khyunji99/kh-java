package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassC implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5993977944878930441L;
	// Ŭ�������� �ִ� serialVersionUID! ���� final�� �����س����� �� Ŭ������
	// �����, ������ �����ص� �������� ���� ������� �ȴ�.
	// serialVersionUID �� ������ ������ �����´�.
	int field1;
	int field2;
	
	//int field2;
	// �̷��� field2�� �߰��ؼ� Ŭ���� ������ �����ϰ� ������ �ϸ�
	// ���ο� Ŭ���� ������ ���������. �� ������ field1�� �ִ� ClassC��
	// field1�� field2�� �ִ� ClassC �̷��� �ΰ��� ����� �Ǵ� ���̴�.
	// ������ �о���� �ִ� field1�� �ִ� ClassC�� �ҷ����� �Ǵ� ���̰�
	// �� ClassC ������ ���������� ������ field1�� field2�� �ִ� ClassC ������
	// �Ǵϱ� ���� ����� �ϴ� Ŭ������ �޶� java.io.InvalidClassException ������ ����.
}
