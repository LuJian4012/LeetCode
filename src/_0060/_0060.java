package _0060;

import java.util.ArrayList;

public class _0060
{
	public static void main(String[] args)
	{
		test(1, 1);
		test(3, 3);
		test(3, 2);
		test(4, 9);
	}

	private static void test(int n, int k)
	{
		Solution s = new Solution();
		System.out.println(s.getPermutation(n, k));
	}
}

class Solution
{
	public String getPermutation(int n, int k)
	{
		int[] nums = new int[Math.max(2, n)];
		nums[0] = 1;
		for (int i = 1; i < n; i++)
			nums[i] = i * nums[i - 1];
		ArrayList<Integer> digits = new ArrayList<>();
		for (int i = 1; i <= 9; i++)
			digits.add(i);
		StringBuilder output = new StringBuilder();
		while (n > 0)
		{
			int idx = (int) Math.ceil(1.0 * k / nums[n - 1]) - 1;
			int digit = digits.remove(idx);
			output.append(digit);
			k %= nums[n - 1];
			if (k == 0)
				k += nums[n - 1];
			n--;
		}
		return output.toString();
	}
}