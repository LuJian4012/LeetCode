package _0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _0018
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
		System.out.println(s.fourSum(new int[] { -1, 0, 1, 2, -1, -4 }, -1));
	}
}

class Solution
{
	public List<List<Integer>> fourSum(int[] nums, int target)
	{
		if (nums.length < 4)
			return Collections.emptyList();
		Arrays.sort(nums);
		int len = nums.length;
		if (nums[0] + nums[1] + nums[2] + nums[3] > target
				|| nums[len - 1] + nums[len - 2] + nums[len - 3] + nums[len - 4] < target)
			return Collections.emptyList();
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < len - 3;)
		{
			if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
				break;
			if (nums[i] + nums[len - 1] + nums[len - 2] + nums[len - 3] < target)
			{
				while (i < len - 3 && nums[i] == nums[++i])
					;
				continue;
			}
			for (int j = i + 1; j < len - 2;)
			{
				if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
					break;
				if (nums[i] + nums[j] + nums[len - 1] + nums[len - 2] < target)
				{
					while (j < len - 2 && nums[j] == nums[++j])
						;
					continue;
				}
				for (int k = j + 1, l = len - 1; k < l;)
				{
					if (nums[i] + nums[j] + nums[k] + nums[l] == target)
						res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
					if (nums[i] + nums[j] + nums[k] + nums[l] <= target)
						while (k < l && nums[k] == nums[++k])
							;
					else
						while (k < l && nums[l] == nums[--l])
							;
				}
				while (j < len - 2 && nums[j] == nums[++j])
					;
			}
			while (i < len - 3 && nums[i] == nums[++i])
				;
		}
		return res;
	}
}