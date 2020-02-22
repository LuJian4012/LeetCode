package _0695;

public class _0695
{
	public static void main(String[] args)
	{
		test(new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } });
		test(new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0 } });
	}

	private static void test(int[][] grid)
	{
		Solution s = new Solution();
		System.out.println(s.maxAreaOfIsland(grid));
	}
}

class Solution
{
	private int maxArea;
	private int[][] grid;
	private int m;
	private int n;

	public int maxAreaOfIsland(int[][] grid)
	{
		if (grid == null || grid.length == 0 || grid[0].length == 0)
			return 0;
		maxArea = 0;
		this.grid = grid;
		m = grid.length;
		n = grid[0].length;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				maxArea = Math.max(maxArea, dfs(i, j));
		return maxArea;
	}

	private int dfs(int i, int j)
	{
		if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0)
			return 0;
		grid[i][j] = 0;
		return 1 + dfs(i + 1, j) + dfs(i - 1, j) + dfs(i, j + 1) + dfs(i, j - 1);
	}
}