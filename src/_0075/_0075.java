package _0075;

import java.util.Arrays;

public class _0075
{
	public static void main(String[] args)
	{
		test(new int[] { 2, 0, 2, 1, 1, 0 });
	}

	private static void test(int[] nums)
	{
		Solution s = new Solution();
		s.sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}

class Solution
{
	public void sortColors(int[] nums)
	{
		int i = 0, j = nums.length - 1, k = 0;
		while (k <= j)
		{
			if (nums[k] == 0)
				swap(nums, i++, k++);
			else if (nums[k] == 2)
				swap(nums, j--, k);
			else
				k++;
		}
	}

	private void swap(int[] nums, int i, int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}