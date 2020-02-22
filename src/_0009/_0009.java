package _0009;

public class _0009
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.isPalindrome(121));
		System.out.println(s.isPalindrome(-121));
		System.out.println(s.isPalindrome(10));
	}
}

class Solution
{
	public boolean isPalindrome(int x)
	{
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int rx = 0;
		while (x > rx)
		{
			rx = rx * 10 + x % 10;
			x /= 10;
		}
		return rx == x || rx / 10 == x;
	}
}