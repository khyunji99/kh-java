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
		System.out.println("내가 찾는 원하는 값의 인덱스: " + index);
		
		int index2 = BSearch(scores, 100);
		System.out.println("내가 찾는 값의 인덱스 BSearch활용: " + index2);
		
		/*
		//객체 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
		 */
	}
	
	// the binary search algorithm 구현
	// 전제조건 : 배열이 정렬되어 있어야 한다.
	// 알고리즘 진행 :
	//  if 찾는값 < 중앙값, then 왼쪽 배열의 중앙값을 찾는다.
	//  if 찾는값 > 중앙값, then 오른쪽 배열의 중앙값을 찾는다.
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
 * Arrays.binarySearch(배열, 찾는 값) : 배열 항목 검색하는 메서드
*/