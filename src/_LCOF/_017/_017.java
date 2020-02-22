package _LCOF._017;

import java.util.Arrays;

public class _017
{
	public static void main(String[] args)
	{
		test(1);
	}

	private static void test(int n)
	{
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.printNumbers(n)));
	}
}

class Solution
{
	public int[] printNumbers(int n)
	{
		int size = (int) Math.pow(10, n) - 1;
		int[] res = new int[size];
		for (int i = 0; i < size; i++)
			res[i] = i + 1;
		return res;
	}
}