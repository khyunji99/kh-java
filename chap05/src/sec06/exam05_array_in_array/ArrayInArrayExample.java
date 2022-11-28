package sec06.exam05_array_in_array;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		// 다차원 배열
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) { // mathScores.length = 2
			for (int k = 0; k < mathScores[i].length; k++) { // mathScores[i].length = 3
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		// 가변배열..?
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) { // englishScores.length = 2 
			for (int k = 0; k < englishScores[i].length; k++) { // englishScores[0].length = 2, englishScores[1].length = 3
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		for (int i = 0; i < javaScores.length; i++) { // javaScores.length = 2
			for (int k = 0; k < javaScores[i].length; k++) { // javaScores[0].length = 2, javaScores[1].length = 3
				System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
			}
		}
	}
}
