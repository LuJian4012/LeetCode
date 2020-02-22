package _0005;

public class _0005
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.longestPalindrome("babad"));
		System.out.println(s.longestPalindrome("cbbd"));
	}
}

class Solution
{
	public String longestPalindrome(String s)
	{
		if (s.length() == 0)
			return "";
		int beginIndex = 0, endIndex = 0;
		for (int i = 0; i < s.length(); i++)
		{
			int x = 0;
			while (i - x >= 0 && i + x <= s.length() - 1)
			{
				if (s.charAt(i - x) == s.charAt(i + x))
					x++;
				else
					break;
			}
			x--;
			if (2 * x + 1 > endIndex - beginIndex + 1)
			{
				beginIndex = i - x;
				endIndex = i + x;
			}
			x = 0;
			while (i - x >= 0 && i + 1 + x <= s.length() - 1)
			{
				if (s.charAt(i - x) == s.charAt(i + x + 1))
					x++;
				else
					break;
			}
			x--;
			if (2 * x + 2 > endIndex - beginIndex + 1)
			{
				beginIndex = i - x;
				endIndex = i + 1 + x;
			}
		}
		return s.substring(beginIndex, endIndex + 1);
	}
}
