package _0013;

import java.util.HashMap;

public class _0013
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.romanToInt("III"));
		System.out.println(s.romanToInt("IV"));
		System.out.println(s.romanToInt("IX"));
		System.out.println(s.romanToInt("LVIII"));
		System.out.println(s.romanToInt("MCMXCIV"));
	}
}

class Solution
{
	public int romanToInt(String s)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		char[] str = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] num = { 1, 5, 10, 50, 100, 500, 1000 };
		for (int i = 0; i < str.length; i++)
			map.put(str[i], num[i]);
		int res = 0, preNum = map.get(s.charAt(s.length() - 1));
		res += preNum;
		for (int i = s.length() - 2; i >= 0; i--)
		{
			int m = map.get(s.charAt(i));
			if (m < preNum)
				res -= m;
			else
				res += m;
			preNum = m;
		}
		return res;
	}
}
