package _LCOF._010_1;

public class _010_1
{
	public static void main(String[] args)
	{
		test(2);
		test(5);
	}

	private static void test(int n)
	{
		Solution s = new Solution();
		System.out.println(s.fib(n));
	}
}

class Solution
{
	long[] nums;

	public int fib(int n)
	{
		nums = new long[Math.max(n + 1, 2)];
		nums[0] = 0;
		nums[1] = 1;
		for (int i = 2; i <= n; i++)
			nums[i] = (nums[i - 2] + nums[i - 1]) % 1000000007;
		return (int) nums[n];
	}
}