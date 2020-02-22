package _LCOF._004;

public class _004
{
	public static void main(String[] args)
	{
		test(new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } }, 5);
		test(new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } }, 20);
	}

	private static void test(int[][] matrix, int target)
	{
		Solution s = new Solution();
		System.out.println(s.findNumberIn2DArray(matrix, target));
	}
}

class Solution
{
	public boolean findNumberIn2DArray(int[][] matrix, int target)
	{
		int i = matrix.length - 1, j = 0;
		while (i >= 0 && j < matrix[0].length)
		{
			if (matrix[i][j] < target)
				j++;
			else if (matrix[i][j] > target)
				i--;
			else
				return true;
		}
		return false;
	}
}