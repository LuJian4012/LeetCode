package _LCOF._010_2;

public class _010_2
{
	public static void main(String[] args)
	{
		test(2);
		test(7);
	}

	private static void test(int n)
	{
		Solution s = new Solution();
		System.out.println(s.numWays(n));
	}
}

class Solution
{
	long[] steps;

	public int numWays(int n)
	{
		steps = new long[Math.max(2, n + 1)];
		steps[0] = steps[1] = 1;
		for (int i = 2; i <= n; i++)
			steps[i] = (steps[i - 2] + steps[i - 1]) % 1000000007;
		return (int) steps[n];
	}
}