package _AC176._01;

public class _01
{

	public static void main(String[] args)
	{
		test(new int[][] { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } });
		test(new int[][] { { -1 } });
	}

	private static void test(int[][] grid)
	{
		Solution s = new Solution();
		System.out.println(s.countNegatives(grid));
	}
}

class Solution
{
	public int countNegatives(int[][] grid)
	{
		int cnt = 0;
		int i = grid.length - 1, j = 0;
		while (i >= 0 && j < grid[0].length)
		{
			if (grid[i][j] >= 0)
				j++;
			else
			{
				cnt += grid[0].length - j;
				i--;
			}
		}
		return cnt;
	}
}