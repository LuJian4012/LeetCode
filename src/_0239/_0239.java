package _0239;

import java.util.Arrays;

public class _0239
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3)));
	}
}

class Solution
{
	public int[] maxSlidingWindow(int[] nums, int k)
	{
		// 暴力法
//		if (nums == null || nums.length == 0 || k == 0)
//			return new int[0];
//		if (k == 1)
//			return nums;
//		int[] ret = new int[nums.length - k + 1];
//		int max = -1;
//		for (int i = 0, j = 0; i <= nums.length - k; i++)
//		{
//			if (max >= i)
//				max = nums[i + k - 1] > nums[max] ? i + k - 1 : max;
//			else
//			{
//				max = i;
//				for (int m = i; m < i + k; m++)
//					max = nums[m] > nums[max] ? m : max;
//			}
//			ret[j++] = nums[max];
//		}
//		return ret;
		// 动态规划
		if (nums == null || nums.length == 0 || k == 0)
			return new int[0];
		if (k == 1)
			return nums;
		int[] fromLeft = new int[nums.length];
		int[] fromRight = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			if (i % k == 0)
				fromLeft[i] = nums[i];
			else
				fromLeft[i] = Math.max(nums[i], fromLeft[i - 1]);
		}
		for (int i = nums.length - 1; i >= 0; i--)
		{
			if (i % k == k - 1 || i == nums.length - 1)
				fromRight[i] = nums[i];
			else
				fromRight[i] = Math.max(nums[i], fromRight[i + 1]);
		}
		int[] ret = new int[nums.length - k + 1];
		for (int i = 0; i <= nums.length - k; i++)
		{
			if (i % k == 0)
				ret[i] = fromRight[i];
			else
				ret[i] = Math.max(fromLeft[i + k - 1], fromRight[i]);
		}
		return ret;
	}
}