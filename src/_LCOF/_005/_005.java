package _LCOF._005;

public class _005
{
	public static void main(String[] args)
	{
		test("We are happy.");
	}

	private static void test(String str)
	{
		Solution s = new Solution();
		System.out.println(s.replaceSpace(str));
	}
}

class Solution
{
	public String replaceSpace(String s)
	{
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray())
			if (c == ' ')
				sb.append("%20");
			else
				sb.append(c);
		return sb.toString();
	}
}