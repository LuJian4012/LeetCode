package _LCOF._014_1;

public class _014_1
{
	public static void main(String[] args)
	{
		test(2);
		test(10);
	}

	private static void test(int n)
	{
		Solution s = new Solution();
		System.out.println(s.cuttingRope(n));
	}
}

class Solution
{
	public int cuttingRope(int n)
	{
		int rem = n % 3;
		if (n <= 3)
			return n - 1;
		if (rem == 0)
			return (int) Math.pow(3, n / 3);
		else if (rem == 1)
			return (int) Math.pow(3, n / 3 - 1) * 4;
		else
			return (int) Math.pow(3, n / 3 - 1) * 6;
	}
}