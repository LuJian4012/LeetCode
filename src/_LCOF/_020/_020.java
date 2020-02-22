package _LCOF._020;

public class _020
{
	public static void main(String[] args)
	{
		test("+100");
		test("5e2");
		test("-123");
		test("3.1416");
		test("0123");
		test("-1E-16");
		test("12e");
		test("1a3.14");
		test("1.2.3");
		test("+-5");
		test("12e+5.4");
	}

	private static void test(String str)
	{
		Solution s = new Solution();
		System.out.println(s.isNumber(str));
	}
}

class Solution
{
	public boolean isNumber(String s)
	{
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{

		}
	}
}