package _0033;

import java.util.Arrays;

public class _0033
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		System.out.println(s.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		System.out.println(s.search(new int[] { 1 }, 0));
		System.out.println(s.search(new int[] { 1, 3 }, 0));
		System.out.println(s.search(new int[] { 3, 1 }, 3));
		System.out.println(s.search(new int[] { 1, 3 }, 3));
		System.out.println(s.search(new int[] { 5, 1, 3 }, 3));
	}
}

class Solution
{
	public int search(int[] nums, int target)
	{
		int length = nums.length;
		if (nums == null || length == 0)
			return -1;
		if (length == 1)
			return nums[0] == target ? 0 : -1;
		int res = -1;
		if (nums[0] > nums[length - 1])
		{
			int rotate = 0;
			int left = 0, right = length - 1;
			while (left <= right)
			{
				int middle = (left + right) / 2;
				if (nums[middle] > nums[middle + 1])
				{
					rotate = middle + 1;
					break;
				}
				if (nums[left] <= nums[middle])
					left = middle + 1;
				else
					right = middle;
			}
			if (nums[0] > target)
				res = Arrays.binarySearch(nums, rotate, nums.length, target);
			else
				res = Arrays.binarySearch(nums, 0, rotate, target);
		}
		else
			res = Arrays.binarySearch(nums, 0, nums.length, target);
		return res >= 0 ? res : -1;
	}
}