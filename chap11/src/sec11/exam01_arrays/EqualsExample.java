package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { {1,2}, {3,4} };
		
		//�A�� ������ �� (�ּҰ��� ����)
		System.out.println("[���� ������ ��]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("�迭 ���� ��: " + original.equals(cloned1)); // false
		// Object Ŭ������ equals() �޼��� (�����ϰ� �ִ� �ּ� �� ��)
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned1)); // true
		// Arrays Ŭ������ equals() �޼��� (������ �ּҰ� ��)
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned1)); // true
		
		
		//���� ������ �� (������ �ִ� �� ��ü�� ���� ���� �޸� ������ ����)
		System.out.println("\n[���� ������ ��]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("�迭 ���� ��: " + original.equals(cloned2)); // false
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned2)); // false
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned2)); // true
	}
}
