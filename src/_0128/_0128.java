package _0128;

import java.util.HashSet;

public class _0128
{
	public static void main(String[] args)
	{
		test(new int[] { 100, 4, 200, 1, 3, 2 });
	}

	private static void test(int[] nums)
	{
		Solution s = new Solution();
		System.out.println(s.longestConsecutive(nums));
	}
}

class Solution
{
	public int longestConsecutive(int[] nums)
	{
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums)
			set.add(num);
		int maxLength = 0;
		for (int num : nums)
		{
			if (!set.contains(num - 1))
			{
				int curNum = num;
				int len = 0;
				while (set.contains(curNum))
				{
					curNum++;
					len++;
				}
				maxLength = Math.max(maxLength, len);
			}
		}
		return maxLength;
	}
}