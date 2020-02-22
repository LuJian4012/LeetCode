package _0029;

public class _0029
{
	public static void main(String[] args)
	{
		Solution s = new Solution();""
		System.out.println(s.divide(10, 3));
		System.out.println(s.divide(7, -3));
	}
}

class Solution
{
	public int divide(int dividend, int divisor)
	{
		int flag = 1;
		if (dividend < 0)
		{
			dividend = -dividend;
			flag = -flag;
		}
		if (divisor < 0)
		{
			divisor = -divisor;
			flag = -flag;
		}
		return 0;
	}
}