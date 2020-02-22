package _0012;

public class _0012
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.intToRoman(3));
		System.out.println(s.intToRoman(4));
		System.out.println(s.intToRoman(9));
		System.out.println(s.intToRoman(58));
		System.out.println(s.intToRoman(1994));
	}
}

class Solution
{
	public String intToRoman(int num)
	{
		int[] val = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; num > 0; i++)
		{
			for (int j = num / val[i]; j > 0; j--)
				sb.append(str[i]);
			num %= val[i];
		}
		return sb.toString();
	}
}
