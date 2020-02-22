package _0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0015
{
	public static void main(String[] args)
	{
		test(new int[] { -1, 0, 1, 2, -1, -4 });
		test(new int[] { 0, 0, 0 });
		test(new int[] { 0, 0, 0, 0 });
	}

	private static void test(int[] nums)
	{
		Solution s = new Solution();
		System.out.println(s.threeSum(nums));
	}

}

class Solution
{
	public List<List<Integer>> threeSum(int[] nums)
	{
		int n = nums.length;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums == null || n < 3)
			return list;
		Arrays.sort(nums);
		for (int i = 0; i < n - 2; i++)
		{
			if (nums[i] + nums[i + 1] + nums[i + 2] > 0)
				break;
			if (nums[i] + nums[n - 2] + nums[n - 1] < 0)
				continue;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int left = i + 1, right = n - 1;
			while (left < right)
			{
				if (nums[right] + nums[right - 1] + nums[right - 2] < 0)
					break;
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0)
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));
				if (sum <= 0)
					while (left < right && nums[left] == nums[++left])
						;
				else
					while (left < right && nums[right] == nums[--right])
						;
			}
		}
		return list;
	}
}