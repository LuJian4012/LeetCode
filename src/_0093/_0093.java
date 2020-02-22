package _0093;

import java.util.ArrayList;
import java.util.List;

public class _0093
{
	public static void main(String[] args)
	{
		test("25525511135");
		test("010010");
	}

	private static void test(String str)
	{
		Solution s = new Solution();
		System.out.println(s.restoreIpAddresses(str));
	}
}

class Solution
{
	private List<String> res = new ArrayList<>();
	private int[] nums;
	private int length;

	public List<String> restoreIpAddresses(String s)
	{
		length = s.length();
		nums = new int[length];
		for (int i = 0; i < length; i++)
			nums[i] = s.charAt(i) - '0';
		dfs(0, 4, "");
		return res;
	}

	private void dfs(int beginIndex, int left, String segments)
	{
		if (length - beginIndex > left * 3 || length - beginIndex < left)
			return;
		if (left == 0)
			res.add(segments.substring(0, segments.length() - 1));
		else
		{
			if (nums[beginIndex] == 0)
				dfs(beginIndex + 1, left - 1, segments + 0 + ".");
			else
			{
				int maxEndIndex = Math.min(length, beginIndex + 3);
				int value = 0;
				for (int i = beginIndex; i < maxEndIndex; i++)
				{
					value = value * 10 + nums[i];
					if (value < 256)
						dfs(i + 1, left - 1, segments + value + ".");
				}
			}

		}
	}
}