package sec06.exam07_array_copy;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		// for문을 이용한 배열 복사
		int[] oldIntArray = {1,2,3};
//		oldIntArray[3] = 4;  // ArrayIndexOutOfBoundsException 발생
		
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