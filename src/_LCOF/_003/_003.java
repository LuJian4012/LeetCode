package _LCOF._003;

public class _003
{
	public static void main(String[] args)
	{
		test(new int[] { 2, 3, 1, 0, 2, 5, 3 });
	}

	private static void test(int[] nums)
	{
		Solution s = new Solution();
		System.out.println(s.findRepeatNumber(nums));
	}
}

class Solution
{
	public int findRepeatNumber(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			while (i != nums[i])
			{
				if (nums[i] != nums[nums[i]])
				{
					int temp = nums[nums[i]];
					nums[nums[i]] = nums[i];
					nums[i] = temp;
				}
				else
					return nums[i];
			}
		}
		return -1;
	}
}