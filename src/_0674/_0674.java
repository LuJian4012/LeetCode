package _0674;

public class _0674
{
	public static void main(String[] args)
	{
		test(new int[] { 1, 3, 5, 4, 7 });
		test(new int[] { 2, 2, 2, 2, 2 });
	}

	private static void test(int[] nums)
	{
		Solution s = new Solution();
		System.out.println(s.findLengthOfLCIS(nums));
	}
}

class Solution
{
	public int findLengthOfLCIS(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return 0;
		int maxLength = 0;
		int slow = 0, fast = 1;
		while (fast < nums.length)
		{
			if (nums[fast - 1] >= nums[fast])
			{
				maxLength = Math.max(maxLength, fast - slow);
				slow = fast;
			}
			fast++;
		}
		return Math.max(maxLength, fast - slow);
	}
}