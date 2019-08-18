package matrix;

public class RotateMatrix {

	public static void main(String[] arsgs) {
		System.out.println(RotateMatrix.class.getSimpleName());

		RotateMatrix rm = new RotateMatrix();

		int N = 4;

		// Test Case 1

		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// Option1
//		mat = rm.rotateMatrixBy(mat);
		// Option2
		mat = rm.rotateMatrix(mat, N);
		rm.displayMatrix(mat);

		int test[] = { 4, 5, 2, 25 };
		test = rm.ngt(test);
		for (int i : test) {
			System.out.println(i);
		}

	}

	public int[] ngt(int test[]) {
		// TODO Auto-generated method stub

		for (int i = 0; i < test.length; i++) {
			for (int j = i; j < test.length; j++) {

				if (j < test.length - 1)
					if (test[i] < test[j + 1]) {
						test[i] = test[j + 1];
						break;
					}
				if (j == test.length - 1) {
					test[i] = -1;
				}

			}

		}

		return test;
	}

	public void displayMatrix(int mat[][]) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.println(" " + mat[i][j]);

			}
			System.out.print("\n");

		}

	}

//	Option 1
	public int[][] rotateMatrixBy(int mat[][]) {
		// TODO Auto-generated method stub
		int length = mat.length;
		int tempMat[][] = new int[length][length];
		for (int i = mat.length - 1, k = 0; i >= 0; i--, k++) {
			for (int j = 0, l = 0; j < length; j++, l++) {

				tempMat[k][l] = mat[j][i];
			}
		}

		return tempMat;

	}

	// option 2
	// https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
	public int[][] rotateMatrix(int mat[][], int N) {
		// Consider all squares one by one
		for (int x = 0; x < N / 2; x++) {
			// Consider elements in group of 4 in
			// current square
			for (int y = x; y < N - x - 1; y++) {
				// store current cell in temp variable
				int temp = mat[x][y];

				// move values from right to top
				mat[x][y] = mat[y][N - 1 - x];

				// move values from bottom to right
				mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];

				// move values from left to bottom
				mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

				// assign temp to left
				mat[N - 1 - y][x] = temp;
			}
		}
		return mat;
	}

}
