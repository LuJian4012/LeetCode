package _LCOF._013;

public class _013
{
	public static void main(String[] args)
	{
		test(2, 3, 1);
		test(3, 1, 0);
	}

	private static void test(int m, int n, int k)
	{
		Solution s = new Solution();
		System.out.println(s.movingCount(m, n, k));
	}
}

class Solution
{
	private int m;
	private int n;
	private int k;
	private boolean[][] visited;
	private int count;

	public int movingCount(int m, int n, int k)
	{
		this.m = m;
		this.n = n;
		this.k = k;
		visited = new boolean[m][n];
		count = 0;
		dfs(0, 0);
		return count;
	}

	private void dfs(int x, int y)
	{
		if (x < 0 || x >= m || y < 0 || y >= n || x / 100 + x % 100 / 10 + x % 10 + y / 100 + y % 100 / 10 + y % 10 > k
				|| visited[x][y] == true)
			return;
		count++;
		visited[x][y] = true;
		dfs(x + 1, y);
		dfs(x, y + 1);
	}
}