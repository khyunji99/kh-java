package sec06.exam07_array_copy;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		// for���� �̿��� �迭 ����
		int[] oldIntArray = {1,2,3};
//		oldIntArray[3] = 4;  // ArrayIndexOutOfBoundsException �߻�
		
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		newIntArray[3] = 4;
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
	}
}