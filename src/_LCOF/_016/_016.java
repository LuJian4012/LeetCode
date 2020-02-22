package _LCOF._016;

public class _016
{
	public static void main(String[] args)
	{
		test(2.00000, 10);
		test(2.10000, 3);
		test(2.00000, -2);
	}

	private static void test(double x, int n)
	{
		Solution s = new Solution();
		System.out.println(s.myPow(x, n));
	}
}

class Solution
{
	public double myPow(double x, int n)
	{
		return myPow(x, (long) n);
	}

	private double myPow(double x, long n)
	{
		if (x == 0)
			return 0;
		if (x == 1 || n == 0)
			return 1;
		if (n < 0)
			return 1.0 / myPow(x, -n);
		double res = 1;
		while (n != 0)
		{
			if ((n & 1) == 1)
				res *= x;
			x *= x;
			n >>= 1;
		}
		return res;
	}
}