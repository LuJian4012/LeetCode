package _0016;

import java.util.Arrays;

public class _0016
{
	public static void main(String[] args)
	{
		Soluton s = new Soluton();
		System.out.println(s.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
	}
}

class Soluton
{
	public int threeSumClosest(int[] nums, int target)
	{
		if (nums == null || nums.length < 3)
			return 0;
		int res = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2;)
		{
			for (int m = i + 1, n = nums.length - 1; m < n;)
			{
				int sum = nums[i] + nums[m] + nums[n];
				if (Math.abs(sum - target) < Math.abs(res - target))
					res = sum;
				if (sum < target)
					while (m < n && nums[m] == nums[++m])
						;
				else if (sum > target)
					while (m < n && nums[n] == nums[--n])
						;
				else
					return res;
			}
			while (i < nums.length - 2 && nums[i] == nums[++i])
				;
		}
		return res;
	}
}