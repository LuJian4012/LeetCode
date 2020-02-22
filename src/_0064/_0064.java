package _0064;

public class _0064
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
	}
}

class Solution
{
	public int minPathSum(int[][] grid)
	{
		int m = grid.length;
		int n = grid[0].length;
		int[] count = grid[m - 1].clone();
		for (int j = n - 2; j >= 0; j--)
			count[j] += count[j + 1];
		for (int i = m - 2; i >= 0; i--)
		{
			count[n - 1] += grid[i][n - 1];
			for (int j = n - 2; j >= 0; j--)
			{
				count[j] = grid[i][j] + Math.min(count[j + 1], count[j]);
			}
		}
		return count[0];
	}
}