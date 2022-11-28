package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98, 96, 100, 95, 93, 94};
		Arrays.sort(scores); // {93, 94, 95, 96, 97, 98, 99, 100}
		
		int index = Arrays.binarySearch(scores, 100);
		// Searches the specified array of ints for the specified value
		// using the binary search algorithm.
		// Binary search algorithm
		// {97, 98, 99}
		System.out.println("���� ã�� ���ϴ� ���� �ε���: " + index);
		
		int index2 = BSearch(scores, 100);
		System.out.println("���� ã�� ���� �ε��� BSearchȰ��: " + index2);
		
		/*
		//��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);
		 */
	}
	
	// the binary search algorithm ����
	// �������� : �迭�� ���ĵǾ� �־�� �Ѵ�.
	// �˰��� ���� :
	//  if ã�°� < �߾Ӱ�, then ���� �迭�� �߾Ӱ��� ã�´�.
	//  if ã�°� > �߾Ӱ�, then ������ �迭�� �߾Ӱ��� ã�´�.
	static int BSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1; 
	}
}
/*
 * Arrays.binarySearch(�迭, ã�� ��) : �迭 �׸� �˻��ϴ� �޼���
*/