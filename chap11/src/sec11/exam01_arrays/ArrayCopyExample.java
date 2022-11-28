package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] array0 = {'J', 'A', 'V', 'A'};
		
		// �迭 ���� ��� 0 (�������� ���)
		// for��
		char[] array1 = new char[4];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = array0[i];
		}
		
		System.out.println(Arrays.toString(array1));
		
		
		// �迭 ���� ��� 1 (���� ���Ͻ�)
		// Arrays.copyOfRange(���� �迭, ���� �ε���, �� �ε���)
		// - ���� �ε��� ~ (�� �ε��� - 1) ������ �׸� ����
		char[] array2 = Arrays.copyOfRange(array1, 0, array1.length);
		System.out.println(Arrays.toString(array2));
		
		
		// �迭 ���� ��� 2
		// Arrays.copyOf(�����迭, ������ ����)
		// - 0 ~ (������ ���� - 1) �ε��������� �׸��� ����
		// - ������ ���̴� ���� �迭�� ���̺��� Ŀ�� �ȴ�.
		char[] array3 = Arrays.copyOf(array0, array0.length);
		System.out.println(Arrays.toString(array3));
		
		
		// �迭 ���� ��� 3
		// System.arraycopy(�����迭, ���������ε���, Ÿ�ٹ迭, Ÿ�ٽ����ε���, �����Ұ���)
		char[] array4 = new char[4];
		System.arraycopy(array0, 0, array4, 0, array0.length);
		System.out.println(Arrays.toString(array4));
		
	}
}

