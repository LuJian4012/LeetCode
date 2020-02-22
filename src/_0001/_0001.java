package _0001;

import java.util.Arrays;
import java.util.HashMap;

public class _0001
{
	public static void main(String[] args)
	{
		test(new int[] { 2, 7, 11, 15 }, 9);
	}

	private static void test(int[] nums, int target)
	{
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.twoSum(nums, target)));
	}
}

class Solution
{
	public int[] twoSum(int[] nums, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
		{
			Integer idx = map.get(target - nums[i]);
			if (idx == null)
				map.put(nums[i], i);
			else
				return new int[] { idx, i };
		}
		return null;
	}
}