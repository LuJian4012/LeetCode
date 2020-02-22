package _0026;

public class _0026
{
	private static void test(int[] nums)
	{
		Solution s = new Solution();
		int len = s.removeDuplicates(nums);
		for (int i = 0; i < len; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] nums1 = { 1, 1, 2 };
		int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		test(nums1);
		test(nums2);
	}
}

class Solution
{
	public int removeDuplicates(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return 0;
		int len = 1, index = 1, num = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] != num)
			{
				num = nums[i];
				nums[index] = nums[i];
				index++;
				len++;
			}
		}
		return len;
	}
}
