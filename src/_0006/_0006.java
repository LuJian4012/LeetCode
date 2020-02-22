package _0006;

public class _0006
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.convert("LEETCODEISHIRING", 3));
		System.out.println(s.convert("LEETCODEISHIRING", 4));
		System.out.println(s.convert("A", 1));
	}
}

class Solution
{
	public String convert(String s, int numRows)
	{
		if (numRows == 1)
			return s;
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		int T = 2 * numRows - 2;
		for (int i = 0; i < numRows; i++)
			for (int j = 0; j + i < len; j += T)
			{
				sb.append(s.charAt(j + i));
				if (i != 0 && i != numRows - 1 && j + T - i < len)
					sb.append(s.charAt(j + T - i));
			}
		return sb.toString();
	}
}
