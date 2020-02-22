package _0031;

import java.util.Arrays;

public class _0031
{
	private static void test(int[] nums)
	{
		Solution s = new Solution();
		for (int num : nums)
			System.out.print(num + " ");
		System.out.print("-> ");
		s.nextPermutation(nums);
		for (int num : nums)
			System.out.print(num + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		test(new int[] { 1, 2, 3 });
		test(new int[] { 3, 2, 1 });
		test(new int[] { 1, 1, 5 });
		test(new int[] { 1, 3, 2 });
	}
}

class Solution
{
	public void nextPermutation(int[] nums)
	{
		int index = nums.length - 2;
		while (index >= 0 && nums[index] >= nums[index + 1])
			index--;
		if (index >= 0)
		{
			int index2 = nums.length;
			while (nums[index] >= nums[--index2])
				;
			swap(nums, index, index2);
		}
		Arrays.sort(nums, index + 1, nums.length);
	}

	private void swap(int[] nums, int i, int j)
	{
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}