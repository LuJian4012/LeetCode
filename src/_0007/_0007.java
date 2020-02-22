package _0007;

public class _0007
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.reverse(123));
		System.out.println(s.reverse(-123));
		System.out.println(s.reverse(120));
		System.out.println(s.reverse(1534236469));
	}
}

class Solution
{
	public int reverse(int x)
	{
		long res = 0;
		while (x != 0)
		{
			res = res * 10 + x % 10;
			x /= 10;
		}
		if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return 0;
		return (int) res;
	}
}