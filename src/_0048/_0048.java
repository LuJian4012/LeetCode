package _0048;

public class _0048
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		test(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
		test(new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } });
	}

	private static void test(int[][] matrix)
	{
		Solution s = new Solution();
		s.rotate(matrix);
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
				System.out.format("%d ", matrix[i][j]);
			System.out.format("\n");
		}
	}
}

class Solution
{
	public void rotate(int[][] matrix)
	{
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++)
		{
			for (int j = i; j < n - 1 - i; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
				matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
	}
}