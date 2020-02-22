package _LCOF._015;

public class _015
{
	public static void main(String[] args)
	{
		test(3);
		test(1);
		test(31);
	}

	private static void test(int n)
	{
		Solution s = new Solution();
		System.out.println(s.hammingWeight(n));
	}
}

class Solution
{
	public int hammingWeight(int n)
	{
		int cnt = 0;
		while (n != 0)
		{
			if ((n & 1) == 1)
				++cnt;
			n >>>= 1;
		}
		return cnt;
	}
}