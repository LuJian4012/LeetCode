package _0096;

public class _0096
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.numTrees(1));
		System.out.println(s.numTrees(3));
	}
}

class Solution
{
	int[] count;

	public int numTrees(int n)
	{
		count = new int[n + 1];
		count[0] = 1;
		count[1] = 1;
		for (int i = 2; i <= n; i++)
		{
			for (int j = 0; j < i; j++)
				count[i] += count[j] * count[i - j - 1];
		}
		return count[n];
	}
}