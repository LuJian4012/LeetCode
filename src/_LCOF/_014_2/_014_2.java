package _LCOF._014_2;

public class _014_2
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
		long res = 1;
		for (int i = 0; i < n / 3 - 1; i++)
			res = (res * 3) % 1000000007;
		if (rem == 0)
			return (int) ((res * 3) % 1000000007);
		else if (rem == 1)
			return (int) ((res * 4) % 1000000007);
		else
			return (int) ((res * 6) % 1000000007);
	}
}