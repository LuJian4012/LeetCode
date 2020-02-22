package _0008;

public class _0008
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.myAtoi("42"));
		System.out.println(s.myAtoi("   -42"));
		System.out.println(s.myAtoi("4193 with words"));
		System.out.println(s.myAtoi("words and 987"));
		System.out.println(s.myAtoi("-91283472332"));
		System.out.println(s.myAtoi("9999999999999999999999999999"));
	}
}

class Solution
{
	public int myAtoi(String str)
	{
		long res = 0;
		int flag = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (flag == 0 && str.charAt(i) == ' ')
			{
				continue;
			}
			else if (str.charAt(i) == '+' || str.charAt(i) == '-')
			{
				if (flag == 0)
					flag = (str.charAt(i) == '+') ? 1 : -1;
				else
					break;
			}
			else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				if (flag == 0)
					flag = 1;
				res = res * 10 + (str.charAt(i) - '0');
				if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
					break;
			}
			else
			{
				break;
			}
		}
		if (res == 0)
			return 0;
		res *= flag;
		if (res > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (res < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int) res;
	}
}
